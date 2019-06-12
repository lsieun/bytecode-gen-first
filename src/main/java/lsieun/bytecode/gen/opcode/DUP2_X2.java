package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DUP2_X2 - Duplicate two top operand stack words and put four down
 * <PRE>Stack: ..., word4, word3, word2, word1 -&gt; ..., word2, word1, word4, word3, word2, word1</PRE>
 */
public final class DUP2_X2 extends Instruction {

    public DUP2_X2() {
        super(OpcodeConst.DUP2_X2, 1);
    }

}
