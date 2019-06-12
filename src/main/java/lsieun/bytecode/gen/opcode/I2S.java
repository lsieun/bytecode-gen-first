package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * I2S - Convert int to short
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class I2S extends Instruction {

    public I2S() {
        super(OpcodeConst.I2S, 1);
    }

}
