package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ARRAYLENGTH -  Get length of array
 * <PRE>Stack: ..., arrayref -&gt; ..., length</PRE>
 */
public final class ARRAYLENGTH extends Instruction {

    public ARRAYLENGTH() {
        super(OpcodeConst.ARRAYLENGTH, 1);
    }

}
