package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FRETURN -  Return float from method
 * <PRE>Stack: ..., value -&gt; &lt;empty&gt;</PRE>
 */
public final class FRETURN extends Instruction {

    public FRETURN() {
        super(OpcodeConst.FRETURN, 1);
    }

}
