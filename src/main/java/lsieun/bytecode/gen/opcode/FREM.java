package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FREM - Remainder of floats
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class FREM extends Instruction {

    public FREM() {
        super(OpcodeConst.FREM, 1);
    }

}
