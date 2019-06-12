package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ISHL - Arithmetic shift left int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class ISHL extends Instruction {

    public ISHL() {
        super(OpcodeConst.ISHL, 1);
    }

}
