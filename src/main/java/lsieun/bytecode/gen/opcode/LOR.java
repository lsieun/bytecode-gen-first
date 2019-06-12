package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LOR - Bitwise OR long
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class LOR extends Instruction {

    public LOR() {
        super(OpcodeConst.LOR, 1);
    }

}
