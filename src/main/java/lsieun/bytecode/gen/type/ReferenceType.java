package lsieun.bytecode.gen.type;

import lsieun.bytecode.gen.cst.TypeConst;

public abstract class ReferenceType extends Type {
    public ReferenceType(final byte type, final String signature) {
        super(type, signature);
    }


    /** Class is non-abstract but not instantiable from the outside
     */
    public ReferenceType() {
        super(TypeConst.T_OBJECT, "<null object>");
    }

}
