package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FNEG - Negate float
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class FNEG extends Instruction {

    public FNEG() {
        super(OpcodeConst.FNEG, 1);
    }

}
