package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ICMPGE - Branch if int comparison succeeds
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ICMPGE extends Instruction {

    public int branch;

    public IF_ICMPGE(final int branch) {
        super(OpcodeConst.IF_ICMPGE, 3);
        this.branch = branch;
    }

}
