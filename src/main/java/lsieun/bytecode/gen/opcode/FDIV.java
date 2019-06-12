package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FDIV - Divide floats
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class FDIV extends Instruction {

    public FDIV() {
        super(OpcodeConst.FDIV, 1);
    }

}
