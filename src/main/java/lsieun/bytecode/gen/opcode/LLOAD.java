package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LLOAD - Load long from local variable
 * <PRE>Stack ... -&gt; ..., result.word1, result.word2</PRE>
 */
public final class LLOAD extends Instruction {

    private int index;

    public LLOAD(final int index) {
        super(OpcodeConst.LLOAD, 2);
        this.index = index;
    }

}
