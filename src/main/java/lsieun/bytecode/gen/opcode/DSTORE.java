package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * DSTORE - Store double into local variable
 * <pre>Stack: ..., value.word1, value.word2 -&gt; ... </PRE>
 */
public final class DSTORE extends Instruction {

    public boolean wide;
    private int index;

    public DSTORE(final int index) {
        super(OpcodeConst.DSTORE, 2);
        this.index = index;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        if (wide) {
            out.writeShort(index);
        } else {
            out.writeByte(index);
        }
    }
}
