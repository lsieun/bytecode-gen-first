package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FSTORE - Store float into local variable
 * <PRE>Stack: ..., value -&gt; ... </PRE>
 */
public final class FSTORE extends Instruction {

    private int index;

    public FSTORE(final int index) {
        super(OpcodeConst.FSTORE, 2);
        this.index = index;
    }

}
