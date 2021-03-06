package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IF_ICMPLT - Branch if int comparison succeeds
 *
 * <PRE>Stack: ..., value1, value2 -&gt; ...</PRE>
 */
public final class IF_ICMPLT extends Instruction {

    public int branch;

    public IF_ICMPLT(final int branch) {
        super(OpcodeConst.IF_ICMPLT, 3);
        this.branch = branch;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(branch);
    }

}
