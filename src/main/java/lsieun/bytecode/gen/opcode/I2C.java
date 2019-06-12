package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * I2C - Convert int to char
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class I2C extends Instruction {

    public I2C() {
        super(OpcodeConst.I2C, 1);
    }

}
