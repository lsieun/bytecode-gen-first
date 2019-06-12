package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * I2L - Convert int to long
 * <PRE>Stack: ..., value -&gt; ..., result.word1, result.word2</PRE>
 */
public final class I2L extends Instruction {

    public I2L() {
        super(OpcodeConst.I2L, 1);
    }

}