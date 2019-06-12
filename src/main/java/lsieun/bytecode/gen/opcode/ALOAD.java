package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ALOAD - Load reference from local variable
 * <PRE>Stack: ... -&gt; ..., objectref</PRE>
 */
public final class ALOAD extends Instruction {

    private int index;

    public ALOAD(final int index) {
        super(OpcodeConst.ALOAD, 2);
        this.index = index;
    }

}
