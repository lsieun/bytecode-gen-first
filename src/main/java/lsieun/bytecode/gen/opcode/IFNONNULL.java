package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IFNONNULL - Branch if reference is not null
 *
 * <PRE>Stack: ..., reference -&gt; ...</PRE>
 */
public final class IFNONNULL extends Instruction {

    public int branch;


    public IFNONNULL(final int branch) {
        super(OpcodeConst.IFNONNULL, 3);
        this.branch = branch;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(branch);
    }

}
