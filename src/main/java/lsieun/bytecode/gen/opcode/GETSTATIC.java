package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * GETSTATIC - Fetch static field from class
 * <PRE>Stack: ..., -&gt; ..., value</PRE>
 * OR
 * <PRE>Stack: ..., -&gt; ..., value.word1, value.word2</PRE>
 */
public final class GETSTATIC extends Instruction {

    private int index;

    public GETSTATIC(final int index) {
        super(OpcodeConst.GETSTATIC, 3);
        this.index = index;
    }

}
