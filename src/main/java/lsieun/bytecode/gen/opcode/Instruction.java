package lsieun.bytecode.gen.opcode;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Instruction {
    public short opcode = -1; // Opcode number
    public int length = 1; // Length of opcode in bytes

    public Instruction(final short opcode, final int length) {
        this.opcode = opcode;
        this.length = length;
    }

    /**
     * Dump instruction as byte code to stream out.
     *
     * @param out Output stream
     */
    public abstract void dump(final DataOutputStream out) throws IOException;
}
