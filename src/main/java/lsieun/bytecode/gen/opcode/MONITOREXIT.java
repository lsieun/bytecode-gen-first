package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * MONITOREXIT - Exit monitor for object
 * <PRE>Stack: ..., objectref -&gt; ...</PRE>
 */
public final class MONITOREXIT extends Instruction {

    public MONITOREXIT() {
        super(OpcodeConst.MONITOREXIT, 1);
    }

}
