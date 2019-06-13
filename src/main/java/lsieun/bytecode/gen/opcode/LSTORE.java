package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LSTORE - Store long into local variable
 * <PRE>Stack: ..., value.word1, value.word2 -&gt; ... </PRE>
 */
public final class LSTORE extends Instruction {

    public boolean wide;
    private int index;

    public LSTORE(final int index) {
        super(OpcodeConst.LSTORE, 2);
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
