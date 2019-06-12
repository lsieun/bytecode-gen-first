package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * BIPUSH - Push byte on stack
 *
 * <PRE>Stack: ... -&gt; ..., value</PRE>
 */
public final class BIPUSH extends Instruction {
    private byte value;

    /**
     * Push byte on stack
     */
    public BIPUSH(final byte value) {
        super(OpcodeConst.BIPUSH, 2);
        this.value = value;
    }

}
