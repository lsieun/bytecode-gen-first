package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DCMPG - Compare doubles: value1 &gt; value2
 * <PRE>Stack: ..., value1.word1, value1.word2, value2.word1, value2.word2 -&gt; ..., result</PRE>
 */
public final class DCMPG extends Instruction {

    public DCMPG() {
        super(OpcodeConst.DCMPG, 1);
    }

}
