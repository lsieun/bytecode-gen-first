package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * LALOAD - Load long from array
 * <PRE>Stack: ..., arrayref, index -&gt; ..., value1, value2</PRE>
 */
public final class LALOAD extends Instruction {

    public LALOAD() {
        super(OpcodeConst.LALOAD, 0);
    }

}
