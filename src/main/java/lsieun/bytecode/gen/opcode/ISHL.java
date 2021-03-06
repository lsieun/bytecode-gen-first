package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ISHL - Arithmetic shift left int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class ISHL extends Instruction {

    public ISHL() {
        super(OpcodeConst.ISHL, 1);
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
    }
}
