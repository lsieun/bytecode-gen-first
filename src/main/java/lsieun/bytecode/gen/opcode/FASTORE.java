package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FASTORE -  Store into float array
 * <PRE>Stack: ..., arrayref, index, value -&gt; ...</PRE>
 */
public final class FASTORE extends Instruction {

    public FASTORE() {
        super(OpcodeConst.FASTORE, 1);
    }

}
