package lsieun.bytecode.gen.classfile;

import lsieun.bytecode.gen.cp.Constant;

public class ConstantPool {
    public int count;
    public Constant[] entries;

    public ConstantPool(final Constant[] constants) {
        this.entries = constants;
        this.count = constants.length;
    }
}
