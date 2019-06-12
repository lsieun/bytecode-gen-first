package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFNE - Branch if int comparison with zero succeeds
 *
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 */
public final class IFNE extends Instruction {

    public int branch;

    public IFNE(final int branch) {
        super(OpcodeConst.IFNE, 3);
        this.branch = branch;
    }

}
