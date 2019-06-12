package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LXOR - Bitwise XOR long
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class LXOR extends Instruction {

    public LXOR() {
        super(OpcodeConst.LXOR, 1);
    }

}
