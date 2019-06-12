package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * SASTORE - Store into short array
 * <PRE>Stack: ..., arrayref, index, value -&gt; ...</PRE>
 */
public final class SASTORE extends Instruction {

    public SASTORE() {
        super(OpcodeConst.SASTORE, 1);
    }

}
