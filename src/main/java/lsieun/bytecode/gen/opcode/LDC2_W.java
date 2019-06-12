package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LDC2_W - Push long or double from constant pool
 *
 * <PRE>Stack: ... -&gt; ..., item.word1, item.word2</PRE>
 */
public final class LDC2_W extends Instruction {

    public int index;

    public LDC2_W(final int index) {
        super(OpcodeConst.LDC2_W, 3);
        this.index = index;
    }

}
