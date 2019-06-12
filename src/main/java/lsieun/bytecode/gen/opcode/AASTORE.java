package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * AASTORE -  Store into reference array
 * <PRE>Stack: ..., arrayref, index, value -&gt; ...</PRE>
 */
public final class AASTORE extends Instruction {

    public AASTORE() {
        super(OpcodeConst.AASTORE, 1);
    }

}
