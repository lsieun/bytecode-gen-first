package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * FCMPL - Compare floats: value1 &lt; value2
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class FCMPL extends Instruction {

    public FCMPL() {
        super(OpcodeConst.FCMPL, 1);
    }

}
