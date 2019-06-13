package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LOOKUPSWITCH - Switch with unordered set of values
 */
public final class LOOKUPSWITCH extends Instruction {

    public int defaultbranch;
    public int npairs;
    public int[] matches;
    public int[] offsets;

    public LOOKUPSWITCH(final int[] match, final int[] targets, final int defaultTarget) {
        super(OpcodeConst.LOOKUPSWITCH, 1);
        // FIXME: LOOKUPSWITCH
        throw new RuntimeException("LOOKUPSWITCH");
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        throw new RuntimeException("");
    }
}
