package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LREM - Remainder of long
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class LREM extends Instruction {

    public LREM() {
        super(OpcodeConst.LREM, 1);
    }

}
