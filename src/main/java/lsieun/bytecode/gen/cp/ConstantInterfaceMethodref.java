package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantInterfaceMethodref extends Constant {
    public int class_index;
    public int name_and_type_index;

    public ConstantInterfaceMethodref(final int class_index, final int name_and_type_index) {
        super(CPConst.CONSTANT_InterfaceMethodref);
        this.class_index = class_index;
        this.name_and_type_index = name_and_type_index;
    }
}
