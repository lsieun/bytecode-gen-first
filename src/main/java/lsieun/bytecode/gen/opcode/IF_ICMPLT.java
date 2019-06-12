package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ICMPLT - Branch if int comparison succeeds
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ICMPLT extends Instruction {

    public int branch;

    public IF_ICMPLT(final int branch) {
        super(OpcodeConst.IF_ICMPLT, 3);
        this.branch = branch;
    }

}
