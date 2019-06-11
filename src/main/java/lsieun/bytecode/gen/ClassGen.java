package lsieun.bytecode.gen;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lsieun.bytecode.gen.attrs.AttributeInfo;
import lsieun.bytecode.gen.attrs.SourceFile;
import lsieun.bytecode.gen.classfile.MethodInfo;
import lsieun.bytecode.gen.cst.JDKConst;
import lsieun.bytecode.gen.cst.JVMConst;

public class ClassGen {
    /* Corresponds to the fields found in a JavaClass object.
     */
    private String class_name;
    private String super_class_name;
    private String file_name;
    private int access_flags;
    private int class_name_index = -1;
    private int superclass_name_index = -1;
    private int major = JDKConst.JAVA_8;
    private int minor = 0;

    private final List<String> interface_vec = new ArrayList();

    private final List<MethodInfo> method_vec = new ArrayList();
    private final List<AttributeInfo> attribute_vec = new ArrayList();

    // Auxiliary Tool
    private ConstantPoolGen cp; // Template for building up constant pool

    public ClassGen(final String class_name, final String super_class_name, final String file_name,
                    final int access_flags, final String[] interfaces,
                    final ConstantPoolGen cp) {
        this.access_flags = access_flags;
        this.class_name = class_name;
        this.super_class_name = super_class_name;
        this.file_name = file_name;
        this.cp = cp;

        // Put everything needed by default into the constant pool and the vectors
        if (file_name != null) {
            addAttribute(new SourceFile(cp.addUtf8("SourceFile"), 2, cp.addUtf8(file_name)));
        }


        class_name_index = cp.addClass(class_name);
        superclass_name_index = cp.addClass(super_class_name);
        if (interfaces != null) {
            for (final String interface1 : interfaces) {
                addInterface(interface1);
            }
        }
    }

    public void addAttribute(final AttributeInfo attr) {
        attribute_vec.add(attr);
    }

    public void addInterface(final String name) {
        interface_vec.add(name);
    }


}
