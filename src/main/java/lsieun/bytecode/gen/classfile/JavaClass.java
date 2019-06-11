package lsieun.bytecode.gen.classfile;

import lsieun.bytecode.gen.attrs.AttributeInfo;

public class JavaClass {
    public int major;
    public int minor; // Compiler version
    public ConstantPool constant_pool; // Constant pool
    public int access_flags;
    public int class_name_index;
    public int superclass_name_index;
    public int[] interfaces; // implemented interfaces
    public FieldInfo[] fields; // Fields, i.e., variables of class
    public MethodInfo[] methods; // methods defined in the class
    public AttributeInfo[] attributes; // attributes defined in the class
}
