package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * D2L - Convert double to long
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ..., result.word1, result.word2</PRE>
 */
public final class D2L extends Instruction {

    public D2L() {
        super(OpcodeConst.D2L, 1);
    }

}
