package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * MULTIANEWARRAY - Create new mutidimensional array of references
 * <PRE>Stack: ..., count1, [count2, ...] -&gt; ..., arrayref</PRE>
 */
public final class MULTIANEWARRAY extends Instruction {
    private int index;
    private int dimensions;

    public MULTIANEWARRAY(final int index, final int dimensions) {
        super(OpcodeConst.MULTIANEWARRAY, 4);

        this.index = index;
        this.dimensions = dimensions;
    }

}
