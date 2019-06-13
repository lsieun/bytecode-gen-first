package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ILOAD - Load int from local variable onto stack
 * <PRE>Stack: ... -&gt; ..., result</PRE>
 */
public final class ILOAD extends Instruction {

    public boolean wide;
    private int index;

    public ILOAD(final int index) {
        super(OpcodeConst.ILOAD, 2);
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
