package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * POP - Pop top operand stack word
 *
 * <PRE>Stack: ..., word -&gt; ...</PRE>
 */
public final class POP extends Instruction {

    public POP() {
        super(OpcodeConst.POP, 1);
    }

}
