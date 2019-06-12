package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INVOKEINTERFACE - Invoke interface method
 * <PRE>Stack: ..., objectref, [arg1, [arg2 ...]] -&gt; ...</PRE>
 */
public final class INVOKEINTERFACE extends Instruction {

    private int index;
    private int count;

    public INVOKEINTERFACE(final int index, final int count) {
        super(OpcodeConst.INVOKEINTERFACE, 5);

        this.index = index;
        this.count = count;
    }

}
