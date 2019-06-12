package lsieun.bytecode.gen.opcode;

public abstract class Instruction {
    public short opcode = -1; // Opcode number
    public int length = 1; // Length of opcode in bytes

    public Instruction(final short opcode, final int length) {
        this.opcode = opcode;
        this.length = length;
    }
}
