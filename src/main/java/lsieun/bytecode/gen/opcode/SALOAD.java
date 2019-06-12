package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * SALOAD - Load short from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., value</PRE>
 */
public final class SALOAD extends Instruction {

    public SALOAD() {
        super(OpcodeConst.SALOAD, 1);
    }

}
