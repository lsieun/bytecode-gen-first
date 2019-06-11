package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantFloat extends Constant {
    public final Float floatValue;

    public ConstantFloat(final float floatValue) {
        super(CPConst.CONSTANT_Float);
        this.floatValue = floatValue;
    }
}
