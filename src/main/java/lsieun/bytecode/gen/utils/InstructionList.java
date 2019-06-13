package lsieun.bytecode.gen.utils;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lsieun.bytecode.gen.opcode.Instruction;

public class InstructionList {
    private List<Instruction> list = new ArrayList();

    public void append(Instruction i) {
        this.list.add(i);
    }

    public byte[] getByteCode() {
        final ByteArrayOutputStream b = new ByteArrayOutputStream();
        final DataOutputStream out = new DataOutputStream(b);
        try {
            for (Instruction i : list) {
                i.dump(out); // Traverse list
            }
            out.flush();
        } catch (final IOException e) {
            System.err.println(e);
            return new byte[0];
        }
        return b.toByteArray();
    }
}
