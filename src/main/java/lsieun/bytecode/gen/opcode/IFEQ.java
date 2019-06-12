package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFEQ - Branch if int comparison with zero succeeds
 *
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 */
public final class IFEQ extends Instruction {

    public int branch;

    public IFEQ(final int branch) {
        super(OpcodeConst.IFEQ, 3);
        this.branch = branch;
    }

}
