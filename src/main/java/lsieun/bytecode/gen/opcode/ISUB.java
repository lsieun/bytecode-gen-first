package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ISUB - Substract ints
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class ISUB extends Instruction {

    public ISUB() {
        super(OpcodeConst.ISUB, 1);
    }

}
