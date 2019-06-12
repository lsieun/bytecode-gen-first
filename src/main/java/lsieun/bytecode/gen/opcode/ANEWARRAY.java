package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ANEWARRAY -  Create new array of references
 * <PRE>Stack: ..., count -&gt; ..., arrayref</PRE>
 */
public final class ANEWARRAY extends Instruction {

    public int index;

    public ANEWARRAY(final int index) {
        super(OpcodeConst.ANEWARRAY, 3);
        this.index = index;
    }

}
