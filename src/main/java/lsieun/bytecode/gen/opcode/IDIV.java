package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IDIV - Divide ints
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class IDIV extends Instruction {

    public IDIV() {
        super(OpcodeConst.IDIV, 1);
    }

}
