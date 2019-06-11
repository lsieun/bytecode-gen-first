package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantDouble extends Constant {
    public final Double doubleValue;

    public ConstantDouble(final double doubleValue) {
        super(CPConst.CONSTANT_Double);
        this.doubleValue = doubleValue;
    }
}
