package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * JSR_W - Jump to subroutine
 */
public final class JSR_W extends Instruction {

    public int branch;


    public JSR_W(final int branch) {
        super(OpcodeConst.JSR_W, 5);
        this.branch = branch;
    }

}
