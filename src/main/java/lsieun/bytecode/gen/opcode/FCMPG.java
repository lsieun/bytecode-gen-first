package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FCMPG - Compare floats: value1 &gt; value2
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class FCMPG extends Instruction {

    public FCMPG() {
        super(OpcodeConst.FCMPG, 1);
    }

}
