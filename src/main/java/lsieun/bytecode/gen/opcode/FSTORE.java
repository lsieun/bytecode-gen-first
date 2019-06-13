package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FSTORE - Store float into local variable
 * <PRE>Stack: ..., value -&gt; ... </PRE>
 */
public final class FSTORE extends Instruction {

    public boolean wide;
    private int index;

    public FSTORE(final int index) {
        super(OpcodeConst.FSTORE, 2);
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
