package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * CALOAD - Load char from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., value</PRE>
 */
public final class CALOAD extends Instruction {

    public CALOAD() {
        super(OpcodeConst.CALOAD, 1);
    }

}
