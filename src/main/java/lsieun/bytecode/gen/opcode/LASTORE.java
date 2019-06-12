package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LASTORE -  Store into long array
 * <PRE>Stack: ..., arrayref, index, value.word1, value.word2 -&gt; ...</PRE>
 */
public final class LASTORE extends Instruction {

    public LASTORE() {
        super(OpcodeConst.LASTORE, 1);
    }

}
