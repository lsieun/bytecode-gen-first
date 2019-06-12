package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LRETURN -  Return long from method
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; &lt;empty&gt;</PRE>
 */
public final class LRETURN extends Instruction {

    public LRETURN() {
        super(OpcodeConst.LRETURN, 1);
    }

}
