package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IASTORE -  Store into int array
 * <PRE>Stack: ..., arrayref, index, value -&gt; ...</PRE>
 */
public final class IASTORE extends Instruction {

    public IASTORE() {
        super(OpcodeConst.IASTORE, 1);
    }

}
