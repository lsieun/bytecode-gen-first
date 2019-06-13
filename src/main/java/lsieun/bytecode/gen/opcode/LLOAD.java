package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LLOAD - Load long from local variable
 * <PRE>Stack ... -&gt; ..., result.word1, result.word2</PRE>
 */
public final class LLOAD extends Instruction {

    public boolean wide;
    private int index;

    public LLOAD(final int index) {
        super(OpcodeConst.LLOAD, 2);
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
