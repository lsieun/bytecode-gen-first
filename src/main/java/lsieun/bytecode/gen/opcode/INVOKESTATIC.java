package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INVOKESTATIC - Invoke a class (static) method
 *
 * <PRE>Stack: ..., [arg1, [arg2 ...]] -&gt; ...</PRE>
 */
public final class INVOKESTATIC extends Instruction {

    public int index;

    public INVOKESTATIC(final int index) {
        super(OpcodeConst.INVOKESTATIC, 3);
        this.index = index;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(index);
    }
}
