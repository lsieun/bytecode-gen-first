package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * BALOAD - Load byte or boolean from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., value</PRE>
 */
public final class BALOAD extends Instruction {

    public BALOAD() {
        super(OpcodeConst.BALOAD, 1);
    }

}
