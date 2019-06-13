package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INVOKEVIRTUAL - Invoke instance method; dispatch based on class
 *
 * <PRE>Stack: ..., objectref, [arg1, [arg2 ...]] -&gt; ...</PRE>
 */
public final class INVOKEVIRTUAL extends Instruction {

    private int index;

    public INVOKEVIRTUAL(final int index) {
        super(OpcodeConst.INVOKEVIRTUAL, 3);
        this.index = index;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(index);
    }
}
