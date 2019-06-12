package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ILOAD - Load int from local variable onto stack
 * <PRE>Stack: ... -&gt; ..., result</PRE>
 */
public final class ILOAD extends Instruction {

    private int index;

    public ILOAD(final int index) {
        super(OpcodeConst.ILOAD, 2);
        this.index = index;
    }

}
