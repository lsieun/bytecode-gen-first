package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * I2F - Convert int to float
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class I2F extends Instruction {

    public I2F() {
        super(OpcodeConst.I2F, 1);
    }

}
