package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * I2B - Convert int to byte
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class I2B extends Instruction {

    public I2B() {
        super(OpcodeConst.I2B, 1);
    }

}
