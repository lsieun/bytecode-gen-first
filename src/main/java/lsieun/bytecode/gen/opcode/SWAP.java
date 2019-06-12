package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * SWAP - Swa top operand stack word
 * <PRE>Stack: ..., word2, word1 -&gt; ..., word1, word2</PRE>
 */
public final class SWAP extends Instruction {

    public SWAP() {
        super(OpcodeConst.SWAP, 1);
    }

}
