package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * GETFIELD - Fetch field from object
 * <PRE>Stack: ..., objectref -&gt; ..., value</PRE>
 * OR
 * <PRE>Stack: ..., objectref -&gt; ..., value.word1, value.word2</PRE>
 */
public class GETFIELD extends Instruction {

    public int index;

    public GETFIELD(final int index) {
        super(OpcodeConst.GETFIELD, 3);
        this.index = index;
    }

}
