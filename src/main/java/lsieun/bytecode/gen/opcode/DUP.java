package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DUP - Duplicate top operand stack word
 * <PRE>Stack: ..., word -&gt; ..., word, word</PRE>
 */
public final class DUP extends Instruction {

    public DUP() {
        super(OpcodeConst.DUP, 1);
    }

}
