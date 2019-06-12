package lsieun.bytecode.gen.opcode;

import lsieun.bytecode.gen.cst.OpcodeConst;

/**
 * Class for INVOKEDYNAMIC. Not an instance of InvokeInstruction, since that class
 * expects to be able to get the class of the method. Ignores the bootstrap
 * mechanism entirely.
 */
public final class INVOKEDYNAMIC extends Instruction {

    private int index;

    public INVOKEDYNAMIC(final int index) {
        super(OpcodeConst.INVOKEDYNAMIC, 5);
        this.index = index;
    }

}
