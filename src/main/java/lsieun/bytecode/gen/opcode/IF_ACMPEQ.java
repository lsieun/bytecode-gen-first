package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ACMPEQ - Branch if reference comparison succeeds
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ACMPEQ extends Instruction {

    public int branch;

    public IF_ACMPEQ(final int branch) {
        super(OpcodeConst.IF_ACMPEQ, 2);
        this.branch = branch;
    }

}
