package lsieun.bytecode.gen.attrs;

import lsieun.bytecode.gen.cst.AttrConst;

public final class Code extends AttributeInfo {
    public final int max_stack; // Maximum size of stack used by this method
    public final int max_locals; // Number of local variables
    public byte[] code; // Actual byte code

    public Code(final int name_index, final int length, final int max_stack, final int max_locals, final byte[] code) {
        super(AttrConst.ATTR_CODE, name_index, length);
        this.max_stack = max_stack;
        this.max_locals = max_locals;
        this.code = code != null ? code : new byte[0];
    }
}
