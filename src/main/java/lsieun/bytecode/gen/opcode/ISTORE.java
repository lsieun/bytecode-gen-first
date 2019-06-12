package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

public final class ISTORE extends Instruction {

    private int index;

    public ISTORE(final int index) {
        super(OpcodeConst.ISTORE, 2);
        this.index = index;
    }

}
