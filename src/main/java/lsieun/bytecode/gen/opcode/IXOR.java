package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IXOR - Bitwise XOR int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class IXOR extends Instruction {

    public IXOR() {
        super(OpcodeConst.IXOR, 1);
    }

}

