package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFGE - Branch if int comparison with zero succeeds
 *
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 */
public final class IFGE extends Instruction {

    public int branch;

    public IFGE(final int branch) {
        super(OpcodeConst.IFGE, 3);
        this.branch = branch;
    }

}
