package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * GETSTATIC - Fetch static field from class
 * <PRE>Stack: ..., -&gt; ..., value</PRE>
 * OR
 * <PRE>Stack: ..., -&gt; ..., value.word1, value.word2</PRE>
 */
public final class GETSTATIC extends Instruction {

    private int index;

    public GETSTATIC(final int index) {
        super(OpcodeConst.GETSTATIC, 3);
        this.index = index;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(index);
    }
}
