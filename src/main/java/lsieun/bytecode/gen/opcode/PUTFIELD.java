package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * PUTFIELD - Put field in object
 * <PRE>Stack: ..., objectref, value -&gt; ...</PRE>
 * OR
 * <PRE>Stack: ..., objectref, value.word1, value.word2 -&gt; ...</PRE>
 */
public class PUTFIELD extends Instruction {

    public int index;

    public PUTFIELD(final int index) {
        super(OpcodeConst.PUTFIELD, 3);
        this.index = index;
    }

}
