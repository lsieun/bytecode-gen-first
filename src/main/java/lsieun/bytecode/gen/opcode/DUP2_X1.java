package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DUP2_X1 - Duplicate two top operand stack words and put three down
 * <PRE>Stack: ..., word3, word2, word1 -&gt; ..., word2, word1, word3, word2, word1</PRE>
 */
public final class DUP2_X1 extends Instruction {

    public DUP2_X1() {
        super(OpcodeConst.DUP2_X1, 1);
    }

}
