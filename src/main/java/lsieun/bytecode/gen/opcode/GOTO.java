package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * GOTO - Branch always (to relative offset, not absolute address)
 */
public final class GOTO extends Instruction {

    public int branch;

    public GOTO(final int branch) {
        super(OpcodeConst.GOTO, 3);
        this.branch = branch;
    }

}
