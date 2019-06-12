package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LDC_W - Push item from constant pool (wide index)
 *
 * <PRE>Stack: ... -&gt; ..., item.word1, item.word2</PRE>
 */
public final class LDC_W extends Instruction {

    public int index;

    public LDC_W(final int index) {
        super(OpcodeConst.LDC_W, 3);
        this.index = index;
    }
}
