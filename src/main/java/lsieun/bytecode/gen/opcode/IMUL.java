package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IMUL - Multiply ints
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class IMUL extends Instruction {

    public IMUL() {
        super(OpcodeConst.IMUL, 1);
    }

}
