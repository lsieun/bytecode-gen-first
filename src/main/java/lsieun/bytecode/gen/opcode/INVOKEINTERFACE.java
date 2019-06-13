package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INVOKEINTERFACE - Invoke interface method
 * <PRE>Stack: ..., objectref, [arg1, [arg2 ...]] -&gt; ...</PRE>
 */
public final class INVOKEINTERFACE extends Instruction {

    private int index;
    private int count;

    public INVOKEINTERFACE(final int index, final int count) {
        super(OpcodeConst.INVOKEINTERFACE, 5);

        this.index = index;
        this.count = count;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        out.writeShort(index);
        out.writeByte(count);
        out.writeByte(0);
    }
}
