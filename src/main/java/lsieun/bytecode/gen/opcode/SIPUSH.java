package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * SIPUSH - Push short
 *
 * <PRE>Stack: ... -&gt; ..., value</PRE>
 */
public final class SIPUSH extends Instruction {

    public short value;

    public SIPUSH(final short value) {
        super(OpcodeConst.SIPUSH, (short) 3);
        this.value = value;
    }

}
