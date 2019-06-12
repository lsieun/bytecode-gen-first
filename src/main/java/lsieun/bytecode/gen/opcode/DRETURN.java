package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DRETURN -  Return double from method
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; &lt;empty&gt;</PRE>
 */
public final class DRETURN extends Instruction {

    public DRETURN() {
        super(OpcodeConst.DRETURN, 1);
    }

}
