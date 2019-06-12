package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DLOAD - Load double from local variable
 * <PRE>Stack ... -&gt; ..., result.word1, result.word2</PRE>
 */
public final class DLOAD extends Instruction {

    private int index;

    public DLOAD(final int index) {
        super(OpcodeConst.DLOAD, 2);
        this.index = index;
    }

}
