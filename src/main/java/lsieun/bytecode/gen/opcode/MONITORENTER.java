package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * MONITORENTER - Enter monitor for object
 * <PRE>Stack: ..., objectref -&gt; ...</PRE>
 */
public final class MONITORENTER extends Instruction {

    public MONITORENTER() {
        super(OpcodeConst.MONITORENTER, 1);
    }

}
