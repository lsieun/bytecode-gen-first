package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INVOKESTATIC - Invoke a class (static) method
 *
 * <PRE>Stack: ..., [arg1, [arg2 ...]] -&gt; ...</PRE>
 */
public class INVOKESTATIC extends Instruction {

    public int index;


    public INVOKESTATIC(final int index) {
        super(OpcodeConst.INVOKESTATIC, 3);
        this.index = index;
    }

}
