package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ICMPNE - Branch if int comparison doesn't succeed
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ICMPNE extends Instruction {

    public int branch;

    public IF_ICMPNE(final int branch) {
        super(OpcodeConst.IF_ICMPNE, 3);
        this.branch = branch;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(branch);
    }

}
