package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DUP_X1 - Duplicate top operand stack word and put two down
 * <PRE>Stack: ..., word2, word1 -&gt; ..., word1, word2, word1</PRE>
 */
public final class DUP_X1 extends Instruction {

    public DUP_X1() {
        super(OpcodeConst.DUP_X1, 1);
    }

}
