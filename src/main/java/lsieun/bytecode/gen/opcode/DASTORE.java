package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DASTORE -  Store into double array
 * <PRE>Stack: ..., arrayref, index, value.word1, value.word2 -&gt; ...</PRE>
 */
public final class DASTORE extends Instruction {

    public DASTORE() {
        super(OpcodeConst.DASTORE, 1);
    }

}
