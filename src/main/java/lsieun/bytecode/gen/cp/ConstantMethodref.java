package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantMethodref extends Constant {
    public int class_index;
    public int name_and_type_index;

    public ConstantMethodref(final int class_index, final int name_and_type_index) {
        super(CPConst.CONSTANT_Methodref);
        this.class_index = class_index;
        this.name_and_type_index = name_and_type_index;
    }
}
