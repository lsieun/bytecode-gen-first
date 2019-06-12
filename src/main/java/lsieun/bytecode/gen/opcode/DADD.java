package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DADD - Add doubles
 * <PRE>Stack: ..., value1.word1, value1.word2, value2.word1, value2.word2 -&gt;</PRE>
 * ..., result.word1, result1.word2
 */
public final class DADD extends Instruction {

    public DADD() {
        super(OpcodeConst.DADD, 1);
    }

}
