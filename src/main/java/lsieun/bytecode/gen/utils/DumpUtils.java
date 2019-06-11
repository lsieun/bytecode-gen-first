package lsieun.bytecode.gen.utils;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.attrs.AttributeInfo;
import lsieun.bytecode.gen.classfile.ConstantPool;
import lsieun.bytecode.gen.classfile.FieldInfo;
import lsieun.bytecode.gen.classfile.JavaClass;
import lsieun.bytecode.gen.classfile.MethodInfo;
import lsieun.bytecode.gen.cp.*;
import lsieun.bytecode.gen.cst.JVMConst;

public class DumpUtils {
    /**
     * Dump class to a file.
     *
     * @param file Output file
     * @throws IOException
     */
    public void dump(final JavaClass javaClass, final File file) throws IOException {
        final String parent = file.getParent();
        if (parent != null) {
            final File dir = new File(parent);
            if (!dir.mkdirs()) { // either was not created or already existed
                if (!dir.isDirectory()) {
                    throw new IOException("Could not create the directory " + dir);
                }
            }
        }
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dumpJavaClass(javaClass, dos);
        }
    }

    /**
     * Dump Java class to output stream in binary format.
     *
     * @param out Output stream
     * @throws IOException
     */
    public void dumpJavaClass(final JavaClass javaClass, final DataOutputStream out) throws IOException {

        out.writeInt(JVMConst.JVM_CLASSFILE_MAGIC);
        out.writeShort(javaClass.minor);
        out.writeShort(javaClass.major);
        dumpConstantPool(javaClass.constant_pool, out);

        out.writeShort(javaClass.access_flags);
        out.writeShort(javaClass.class_name_index);
        out.writeShort(javaClass.superclass_name_index);
        out.writeShort(javaClass.interfaces.length);
        for (final int interface_index : javaClass.interfaces) {
            out.writeShort(interface_index);
        }

        out.writeShort(javaClass.fields.length);
        for (final FieldInfo field : javaClass.fields) {
            dumpFieldInfo(field, out);
        }

        out.writeShort(javaClass.methods.length);
        for (final MethodInfo method : javaClass.methods) {
            dumpMethodInfo(method, out);
        }

        if (javaClass.attributes != null) {
            out.writeShort(javaClass.attributes.length);
            for (final AttributeInfo attribute : javaClass.attributes) {
                dumpAttributeInfo(attribute, out);
            }
        } else {
            out.writeShort(0);
        }

        out.flush();
    }

    public void dumpConstantPool(final ConstantPool constant_pool, final DataOutputStream out) throws IOException {
        out.writeShort(constant_pool.count);
        for (int i = 1; i < constant_pool.count; i++) {
            Constant constant = constant_pool.entries[i];
            if(constant == null) continue;
            if(constant instanceof ConstantUtf8) {
                ConstantUtf8 item = (ConstantUtf8) constant;

                out.writeByte(item.tag);
                out.writeUTF(item.utf8Value);
            }
            else if(constant instanceof ConstantInteger) {
                ConstantInteger item = (ConstantInteger) constant;

                out.writeByte(item.tag);
                out.writeInt(item.intValue);
            }
            else if(constant instanceof ConstantFloat) {
                ConstantFloat item = (ConstantFloat) constant;

                out.writeByte(item.tag);
                out.writeFloat(item.floatValue);
            }
            else if(constant instanceof ConstantLong) {
                ConstantLong item = (ConstantLong) constant;

                out.writeByte(item.tag);
                out.writeLong(item.longValue);
            }
            else if(constant instanceof ConstantDouble) {
                ConstantDouble item = (ConstantDouble) constant;

                out.writeByte(item.tag);
                out.writeDouble(item.doubleValue);
            }
            else if(constant instanceof ConstantClass) {
                ConstantClass item = (ConstantClass) constant;

                out.writeByte(item.tag);
                out.writeShort(item.name_index);
            }
            else if(constant instanceof ConstantString) {
                ConstantString item = (ConstantString) constant;

                out.writeByte(item.tag);
                out.writeShort(item.string_index);
            }
            else if(constant instanceof ConstantFieldref) {
                ConstantFieldref item = (ConstantFieldref) constant;

                out.writeByte(item.tag);
                out.writeShort(item.class_index);
                out.writeShort(item.name_and_type_index);
            }
            else if(constant instanceof ConstantMethodref) {
                ConstantMethodref item = (ConstantMethodref) constant;

                out.writeByte(item.tag);
                out.writeShort(item.class_index);
                out.writeShort(item.name_and_type_index);
            }
            else if(constant instanceof ConstantInterfaceMethodref) {
                ConstantInterfaceMethodref item = (ConstantInterfaceMethodref) constant;

                out.writeByte(item.tag);
                out.writeShort(item.class_index);
                out.writeShort(item.name_and_type_index);
            }
        }
    }

    public void dumpFieldInfo(final FieldInfo fieldInfo, final DataOutputStream out) {
        //
    }

    public void dumpMethodInfo(final MethodInfo methodInfo, final DataOutputStream out) {
        //
    }

    public void dumpAttributeInfo(final AttributeInfo attributeInfo, final DataOutputStream out) {
        //
    }
}
