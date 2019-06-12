package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * INVOKESPECIAL - Invoke instance method; special handling for superclass, private
 * and instance initialization method invocations
 *
 * <PRE>Stack: ..., objectref, [arg1, [arg2 ...]] -&gt; ...</PRE>
 */
public final class INVOKESPECIAL extends Instruction {

    public int index;

    public INVOKESPECIAL(final int index) {
        super(OpcodeConst.INVOKESPECIAL, 3);
        this.index = index;
    }

}
