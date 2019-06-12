package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ISHR - Arithmetic shift right int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class ISHR extends Instruction {

    public ISHR() {
        super(OpcodeConst.ISHR, 1);
    }

}
