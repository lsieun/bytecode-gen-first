package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DSTORE - Store double into local variable
 * <pre>Stack: ..., value.word1, value.word2 -&gt; ... </PRE>
 */
public final class DSTORE extends Instruction {

    private int index;

    public DSTORE(final int index) {
        super(OpcodeConst.DSTORE, 2);
        this.index = index;
    }

}
