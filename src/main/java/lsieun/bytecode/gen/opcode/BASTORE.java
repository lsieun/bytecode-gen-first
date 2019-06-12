package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * BASTORE -  Store into byte or boolean array
 * <PRE>Stack: ..., arrayref, index, value -&gt; ...</PRE>
 */
public final class BASTORE extends Instruction {

    public BASTORE() {
        super(OpcodeConst.BASTORE, 1);
    }

}
