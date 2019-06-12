package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFGT - Branch if int comparison with zero succeeds
 *
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 */
public final class IFGT extends Instruction {

    public int branch;

    public IFGT(final int branch) {
        super(OpcodeConst.IFGT, 2);
        this.branch = branch;
    }

}
