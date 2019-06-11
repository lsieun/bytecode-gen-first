package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantLong extends Constant {
    public final Long longValue;

    public ConstantLong(final long longValue) {
        super(CPConst.CONSTANT_Long);
        this.longValue = longValue;
    }
}
