package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IINC - Increment local variable by constant
 */
public final class IINC extends Instruction {

    public boolean wide;
    private int index;
    private int constValue;

    public IINC(final int index, final int constValue) {
        super(OpcodeConst.IINC, 3);
        this.index = index;
        this.constValue = constValue;
    }

    @Override
    public void dump(DataOutputStream out) throws IOException {
        out.writeByte(opcode);
        if(wide) {
            out.writeShort(index);
            out.writeShort(constValue);
        }
        else {
            out.writeByte(index);
            out.writeByte(constValue);
        }
    }
}
