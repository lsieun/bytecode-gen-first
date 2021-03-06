package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * TABLESWITCH - Switch within given range of values, i.e., low..high
 */
public final class TABLESWITCH extends Instruction {

    public int defaultbranch;
    public int low;
    public int high;
    public int[] offsets;

    public TABLESWITCH() {
        super(OpcodeConst.TABLESWITCH, 1);
        // FIXME: TABLESWITCH
        throw new RuntimeException("TABLESWITCH");
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        throw new RuntimeException("");
    }
}
