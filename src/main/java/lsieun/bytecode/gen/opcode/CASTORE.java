package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * CASTORE -  Store into char array
 * <PRE>Stack: ..., arrayref, index, value -&gt; ...</PRE>
 */
public final class CASTORE extends Instruction {

    public CASTORE() {
        super(OpcodeConst.CASTORE, 1);
    }

}
