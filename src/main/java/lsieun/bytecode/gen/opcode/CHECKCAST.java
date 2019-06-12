package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * CHECKCAST - Check whether object is of given type
 * <PRE>Stack: ..., objectref -&gt; ..., objectref</PRE>
 */
public final class CHECKCAST extends Instruction {

    public int index;


    public CHECKCAST(final int index) {
        super(OpcodeConst.CHECKCAST, 3);
        this.index = index;
    }

}
