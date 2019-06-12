package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ACMPNE - Branch if reference comparison doesn't succeed
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ACMPNE extends Instruction {

    public int branch;

    public IF_ACMPNE(final int branch) {
        super(OpcodeConst.IF_ACMPNE, 3);
        this.branch = branch;
    }

}