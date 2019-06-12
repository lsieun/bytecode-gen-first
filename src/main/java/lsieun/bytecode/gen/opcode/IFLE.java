package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFLE - Branch if int comparison with zero succeeds
 *
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 */
public final class IFLE extends Instruction {

    public int branch;

    public IFLE(final int branch) {
        super(OpcodeConst.IFLE, 3);
        this.branch = branch;
    }

}
