package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * NEW - Create new object
 * <PRE>Stack: ... -&gt; ..., objectref</PRE>
 */
public final class NEW extends Instruction {

    private int index;

    public NEW(final int index) {
        super(OpcodeConst.NEW, 3);
        this.index = index;
    }

}
