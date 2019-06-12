package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ICMPLE - Branch if int comparison succeeds
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ICMPLE extends Instruction {

    public int branch;

    public IF_ICMPLE(final int branch) {
        super(OpcodeConst.IF_ICMPLE, 3);
        this.branch = branch;
    }

}
