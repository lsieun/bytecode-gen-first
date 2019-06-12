package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FMUL - Multiply floats
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class FMUL extends Instruction {

    public FMUL() {
        super(OpcodeConst.FMUL, 1);
    }

}
