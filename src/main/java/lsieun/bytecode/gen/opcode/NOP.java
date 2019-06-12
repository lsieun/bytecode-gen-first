package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * NOP - Do nothing
 */
public class NOP extends Instruction {

    public NOP() {
        super(OpcodeConst.NOP, 1);
    }

}
