package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DUP2 - Duplicate two top operand stack words
 * <PRE>Stack: ..., word2, word1 -&gt; ..., word2, word1, word2, word1</PRE>
 */
public final class DUP2 extends Instruction {

    public DUP2() {
        super(OpcodeConst.DUP2, 1);
    }

}