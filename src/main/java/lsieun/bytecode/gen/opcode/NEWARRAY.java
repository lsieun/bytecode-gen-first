package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * NEWARRAY -  Create new array of basic type (int, short, ...)
 * <PRE>Stack: ..., count -&gt; ..., arrayref</PRE>
 * type must be one of T_INT, T_SHORT, ...
 */
public final class NEWARRAY extends Instruction {
    private byte atype; // array type

    public NEWARRAY(final byte atype) {
        super(OpcodeConst.NEWARRAY, 2);
        this.atype = atype;
    }

}
