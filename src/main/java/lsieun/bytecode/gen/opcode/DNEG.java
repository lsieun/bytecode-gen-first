package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DNEG - Negate double
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ..., result.word1, result.word2</PRE>
 */
public final class DNEG extends Instruction {

    public DNEG() {
        super(OpcodeConst.DNEG, 1);
    }

}
