package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * JSR - Jump to subroutine
 */
public class JSR extends Instruction {

    public int branch;

    public JSR(final int branch) {
        super(OpcodeConst.JSR, 3);
        this.branch = branch;
    }

}
