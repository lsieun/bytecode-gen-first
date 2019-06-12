package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IREM - Remainder of int
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class IREM extends Instruction {

    public IREM() {
        super(OpcodeConst.IREM, 1);
    }

}
