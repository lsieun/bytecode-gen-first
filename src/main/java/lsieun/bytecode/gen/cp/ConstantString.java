package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantString extends Constant {
    public final int string_index;

    public ConstantString(final int string_index) {
        super(CPConst.CONSTANT_String);
        this.string_index = string_index;
    }
}
