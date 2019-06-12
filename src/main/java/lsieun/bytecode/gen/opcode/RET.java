package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * RET - Return from subroutine
 *
 * <PRE>Stack: ... -&gt; ...</PRE>
 */
public class RET extends Instruction {

    public boolean wide;
    private int index; // index to local variable containg the return address

    public RET(final int index) {
        super(OpcodeConst.RET, 2);
        this.index = index;
    }
}
