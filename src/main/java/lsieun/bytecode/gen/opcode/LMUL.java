package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LMUL - Multiply longs
 * <PRE>Stack: ..., value1.word1, value1.word2, value2.word1, value2.word2 -&gt;</PRE>
 * ..., result.word1, result.word2
 */
public final class LMUL extends Instruction {

    public LMUL() {
        super(OpcodeConst.LMUL, 1);
    }

}
