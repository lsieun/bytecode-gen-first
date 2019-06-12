package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ASTORE - Store reference into local variable
 * <PRE>Stack ..., objectref -&gt; ... </PRE>
 */
public final class ASTORE extends Instruction {

    private int index;

    public ASTORE(final int index) {
        super(OpcodeConst.ASTORE, 2);
        this.index = index;
    }

}
