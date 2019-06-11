package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantClass extends Constant {
    public final int name_index;

    public ConstantClass(final int name_index) {
        super(CPConst.CONSTANT_Class);
        this.name_index = name_index;
    }
}
