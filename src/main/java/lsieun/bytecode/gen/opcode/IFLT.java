package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFLT - Branch if int comparison with zero succeeds
 *
 * <PRE>Stack: ..., value -&gt; ...</PRE>
 */
public final class IFLT extends Instruction {

    public int branch;

    public IFLT(final int branch) {
        super(OpcodeConst.IFLT, 3);
        this.branch = branch;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(branch);
    }

}
