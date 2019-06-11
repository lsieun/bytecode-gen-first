package lsieun.bytecode.gen;

import java.util.ArrayList;
import java.util.List;

import lsieun.bytecode.gen.attrs.AttributeInfo;
import lsieun.bytecode.gen.attrs.Code;
import lsieun.bytecode.gen.classfile.MethodInfo;
import lsieun.bytecode.gen.type.Type;
import lsieun.bytecode.gen.utils.TypeUtils;

public class MethodGen {
    //Class Info
    private String class_name;

    // Method Info
    private int access_flags;
    private String method_name;
    private Type return_type;
    private Type[] arg_types;
    private String[] arg_names;

    // Method Attribute Info
    private final List<AttributeInfo> attribute_vec = new ArrayList(); // method attribute

    // Code Info
    private byte[] code_bytes;
    private int max_locals;
    private int max_stack;

    // Auxiliary Tool
    private ConstantPoolGen cp;

    public MethodGen(final int access_flags, final Type return_type, final Type[] arg_types, String[] arg_names,
                     final String method_name, final String class_name,
                     final byte[] code_bytes, int max_locals, int max_stack,
                     final ConstantPoolGen cp) {
        //Class Info
        this.class_name = class_name;

        // Method Info
        this.method_name = method_name;
        this.access_flags = access_flags;
        this.return_type = return_type;
        this.arg_types = arg_types;
        this.arg_names = arg_names;

        // Code Info
        this.code_bytes = code_bytes;
        this.max_locals = max_locals;
        this.max_stack = max_stack;

        // Auxiliary Tool
        this.cp = cp;

        if (arg_types != null) {
            final int size = arg_types.length;
            for (final Type arg_type : arg_types) {
                if (TypeUtils.VOID == arg_type) {
                    throw new RuntimeException("'void' is an illegal argument type for a method");
                }
            }
            if (arg_names != null) { // Names for variables provided?
                if (size != arg_names.length) {
                    throw new RuntimeException("Mismatch in argument array lengths: " + size
                            + " vs. " + arg_names.length);
                }
            } else { // Give them dummy names
                arg_names = new String[size];
                for (int i = 0; i < size; i++) {
                    arg_names[i] = "arg" + i;
                }
                this.arg_names = arg_names;
            }
        }
    }

    public String getSignature() {
        return TypeUtils.getMethodSignature(return_type, arg_types);
    }

    /**
     * @return all attributes of this method.
     */
    public AttributeInfo[] getAttributes() {
        final AttributeInfo[] attributes = new AttributeInfo[attribute_vec.size()];
        attribute_vec.toArray(attributes);
        return attributes;
    }

    /**
     * Get method object. Never forget to call setMaxStack() or setMaxStack(max), respectively,
     * before calling this method (the same applies for max locals).
     *
     * @return method object
     */
    public MethodInfo getMethod() {
        final String signature = getSignature();
        final int name_index = cp.addUtf8(this.method_name);
        final int signature_index = cp.addUtf8(signature);

        final AttributeInfo[] code_attrs = new AttributeInfo[0];
        /* Each attribute causes 6 additional header bytes
         */
        int attrs_len = 0;
        for (final AttributeInfo code_attr : code_attrs) {
            attrs_len += code_attr.attribute_length + 6;
        }

        int exc_len = 0 * 8; // Every entry takes 8 bytes

        Code code = code = new Code(cp.addUtf8("Code"), 8 + code_bytes.length + // prologue byte code
                2 + exc_len + // exceptions
                2 + attrs_len, // attributes
                max_stack, max_locals, code_bytes);
        addAttribute(code);

        //
        final MethodInfo m = new MethodInfo(access_flags, name_index, signature_index, getAttributes());
        return m;
    }

    /**
     * Add an attribute to this method. Currently, the JVM knows about
     * the `Code', `ConstantValue', `Synthetic' and `Exceptions'
     * attributes. Other attributes will be ignored by the JVM but do no
     * harm.
     *
     * @param attr attribute to be added
     */
    public void addAttribute(final AttributeInfo attr) {
        attribute_vec.add(attr);
    }

    /**
     * Remove an attribute.
     */
    public void removeAttribute(final AttributeInfo attr) {
        attribute_vec.remove(attr);
    }
}
