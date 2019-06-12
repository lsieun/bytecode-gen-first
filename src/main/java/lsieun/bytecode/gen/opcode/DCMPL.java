package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DCMPL - Compare doubles: value1 &lt; value2
 * <PRE>Stack: ..., value1.word1, value1.word2, value2.word1, value2.word2 -&gt; ..., result</PRE>
 */
public final class DCMPL extends Instruction {

    public DCMPL() {
        super(OpcodeConst.DCMPL, 1);
    }

}
