package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LUSHR - Logical shift right long
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class LUSHR extends Instruction {

    public LUSHR() {
        super(OpcodeConst.LUSHR, 1);
    }

}
