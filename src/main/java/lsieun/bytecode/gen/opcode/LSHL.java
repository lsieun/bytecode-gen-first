package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LSHL - Arithmetic shift left long
 * <PRE>Stack: ..., value1.word1, value1.word2, value2 -&gt; ..., result.word1, result.word2</PRE>
 */
public final class LSHL extends Instruction {

    public LSHL() {
        super(OpcodeConst.LSHL, 1);
    }

}
