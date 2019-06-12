package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LSTORE - Store long into local variable
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ... </PRE>
 */
public final class LSTORE extends Instruction {

    private int index;

    public LSTORE(final int index) {
        super(OpcodeConst.LSTORE, 2);
        this.index = index;
    }

}
