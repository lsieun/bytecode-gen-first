package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * PUTSTATIC - Put static field in class
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 * OR
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ...</PRE>
 */
public final class PUTSTATIC extends Instruction {

    public int index;

    public PUTSTATIC(final int index) {
        super(OpcodeConst.PUTSTATIC, 3);
        this.index = index;
    }

}
