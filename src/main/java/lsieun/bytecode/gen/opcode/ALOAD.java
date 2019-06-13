package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * ALOAD - Load reference from local variable
 * <PRE>Stack: ... -&gt; ..., objectref</PRE>
 */
public final class ALOAD extends Instruction {

    public boolean wide;
    private int index;

    public ALOAD(final int index) {
        super(OpcodeConst.ALOAD, 2);
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
