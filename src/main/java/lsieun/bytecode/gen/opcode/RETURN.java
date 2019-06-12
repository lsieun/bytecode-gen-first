package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * RETURN -  Return from void method
 * <PRE>Stack: ... -&gt; &lt;empty&gt;</PRE>
 */
public final class RETURN extends Instruction {

    public RETURN() {
        super(OpcodeConst.RETURN, 1);
    }

}
