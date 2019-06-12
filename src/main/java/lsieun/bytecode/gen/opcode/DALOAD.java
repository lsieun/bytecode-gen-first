package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DALOAD - Load double from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., result.word1, result.word2</PRE>
 */
public final class DALOAD extends Instruction {

    public DALOAD() {
        super(OpcodeConst.DALOAD, 1);
    }

}
