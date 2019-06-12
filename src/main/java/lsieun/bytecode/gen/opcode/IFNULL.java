package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFNULL - Branch if reference is not null
 *
 * <PRE>Stack: ..., reference -&gt; ...</PRE>
 */
public final class IFNULL extends Instruction {

    public int branch;

    public IFNULL(final int branch) {
        super(OpcodeConst.IFNULL, 3);
        this.branch = branch;
    }

}
