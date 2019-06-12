package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LNEG - Negate long
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ..., result.word1, result.word2</PRE>
 */
public final class LNEG extends Instruction {

    public LNEG() {
        super(OpcodeConst.LNEG, 1);
    }

}
