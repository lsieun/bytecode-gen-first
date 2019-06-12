package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ARETURN -  Return reference from method
 * <PRE>Stack: ..., objectref -&gt; &lt;empty&gt;</PRE>
 */
public final class ARETURN extends Instruction {

    public ARETURN() {
        super(OpcodeConst.ARETURN, 1);
    }

}
