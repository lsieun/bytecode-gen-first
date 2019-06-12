package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IUSHR - Logical shift right int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class IUSHR extends Instruction {

    public IUSHR() {
        super(OpcodeConst.IUSHR, 1);
    }

}
