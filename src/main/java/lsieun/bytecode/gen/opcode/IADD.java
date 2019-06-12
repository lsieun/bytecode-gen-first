package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IADD - Add ints
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class IADD extends Instruction {

    public IADD() {
        super(OpcodeConst.IADD, 1);
    }

}
