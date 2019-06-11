package lsieun.bytecode.gen.cp;

import lsieun.bytecode.gen.cst.CPConst;

public class ConstantNameAndType extends Constant {
    public final int name_index;
    public final int descriptor_index;

    public ConstantNameAndType(final int name_index, final int signature_index) {
        super(CPConst.CONSTANT_NameAndType);
        this.name_index = name_index;
        this.descriptor_index = signature_index;
    }
}
