package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

public class ACONST_NULL extends Instruction {

    public ACONST_NULL() {
        super(OpcodeConst.ACONST_NULL, 1);
    }

}
