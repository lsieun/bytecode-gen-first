package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

public final class INSTANCEOF extends Instruction {

    public int index;

    public INSTANCEOF(final int index) {
        super(OpcodeConst.INSTANCEOF, 3);
        this.index = index;
    }

}
