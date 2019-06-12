package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FADD - Add floats
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class FADD extends Instruction {

    public FADD() {
        super(OpcodeConst.FADD, 1);
    }

}
