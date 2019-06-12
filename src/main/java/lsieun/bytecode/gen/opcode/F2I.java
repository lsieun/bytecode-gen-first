package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * F2I - Convert float to int
 * <PRE>Stack: ..., value -&gt; ..., result</PRE>
 */
public final class F2I extends Instruction {

    public F2I() {
        super(OpcodeConst.F2I, 1);
    }

}
