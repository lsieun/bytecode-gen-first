package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * D2F - Convert double to float
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ..., result</PRE>
 */
public final class D2F extends Instruction {

    public D2F() {
        super(OpcodeConst.D2F, 1);
    }

}
