package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IADD - Add ints
 * <PRE>Stack: ..., value1, value2 -&gt; result</PRE>
 */
public final class IADD extends Instruction {

    public IADD() {
        super(OpcodeConst.IADD, 1);
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
    }
}
