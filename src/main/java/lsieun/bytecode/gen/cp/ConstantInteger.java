package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantInteger extends Constant {
    public final Integer intValue;

    public ConstantInteger(final int num) {
        super(CPConst.CONSTANT_Integer);
        this.intValue = num;
    }
}
