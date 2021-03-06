package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

public final class WIDE extends Instruction {

    public WIDE() {
        super(OpcodeConst.WIDE, 1);
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
    }
}
