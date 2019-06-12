package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IAND - Bitwise AND int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class IAND extends Instruction {

    public IAND() {
        super(OpcodeConst.IAND, 1);
    }

}
