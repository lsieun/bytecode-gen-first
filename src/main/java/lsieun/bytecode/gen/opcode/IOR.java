package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * IOR - Bitwise OR int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public final class IOR extends Instruction {

    public IOR() {
        super(OpcodeConst.IOR, 1);
    }

}
