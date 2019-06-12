package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FALOAD - Load float from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., value</PRE>
 */
public final class FALOAD extends Instruction {

    public FALOAD() {
        super(OpcodeConst.FALOAD, 1);
    }

}
