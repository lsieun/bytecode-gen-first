package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ICMPEQ - Branch if int comparison succeeds
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ICMPEQ extends Instruction {

    public int branch;

    public IF_ICMPEQ(final int branch) {
        super(OpcodeConst.IF_ICMPEQ, 3);
        this.branch = branch;
    }

}
