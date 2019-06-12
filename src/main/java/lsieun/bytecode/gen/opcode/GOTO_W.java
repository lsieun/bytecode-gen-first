package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * GOTO_W - Branch always (to relative offset, not absolute address)
 */
public final class GOTO_W extends Instruction {

    public int branch;

    public GOTO_W(final int branch) {
        super(OpcodeConst.GOTO_W, 5);
        this.branch = branch;
    }

}
