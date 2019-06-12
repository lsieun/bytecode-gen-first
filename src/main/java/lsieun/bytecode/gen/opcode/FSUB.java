package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FSUB - Substract floats
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class FSUB extends Instruction {

    public FSUB() {
        super(OpcodeConst.FSUB, 1);
    }

}
