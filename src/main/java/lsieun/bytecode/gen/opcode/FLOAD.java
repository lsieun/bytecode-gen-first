package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FLOAD - Load float from local variable
 * <PRE>Stack ... -&gt; ..., result</PRE>
 */
public final class FLOAD extends Instruction {

    private int index;

    public FLOAD(final int index) {
        super(OpcodeConst.FLOAD, 2);
        this.index = 0;
    }

}
