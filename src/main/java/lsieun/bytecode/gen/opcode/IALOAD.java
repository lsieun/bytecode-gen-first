package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IALOAD - Load int from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., value</PRE>
 */
public final class IALOAD extends Instruction {

    public IALOAD() {
        super(OpcodeConst.IALOAD, 1);
    }

}
