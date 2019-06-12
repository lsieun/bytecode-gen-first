package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * POP2 - Pop two top operand stack words
 *
 * <PRE>Stack: ..., word2, word1 -&gt; ...</PRE>
 */
public final class POP2 extends Instruction {

    public POP2() {
        super(OpcodeConst.POP2, 1);
    }

}
