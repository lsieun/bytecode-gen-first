package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ATHROW -  Throw exception
 * <PRE>Stack: ..., objectref -&gt; objectref</PRE>
 */
public final class ATHROW extends Instruction {

    public ATHROW() {
        super(OpcodeConst.ATHROW, 1);
    }

}
