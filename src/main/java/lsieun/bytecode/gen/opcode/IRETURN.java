package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IRETURN -  Return int from method
 * <PRE>Stack: ..., value -&gt; &lt;empty&gt;</PRE>
 */
public final class IRETURN extends Instruction {

    public IRETURN() {
        super(OpcodeConst.IRETURN, 1);
    }

}
