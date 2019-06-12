package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INEG - Negate int
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class INEG extends Instruction {

    public INEG() {
        super(OpcodeConst.INEG, 1);
    }

}
