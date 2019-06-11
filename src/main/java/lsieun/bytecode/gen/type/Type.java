package lsieun.bytecode.gen.type;

import lsieun.bytecode.gen.cst.TypeConst;


public abstract class Type {

    private final byte type;

    private String signature; // signature for the type

    protected Type(final byte t, final String s) {
        type = t;
        signature = s;
    }

    public byte getType() {
        return type;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(final String signature) {
        this.signature = signature;
    }

    /**
     * @return stack size of this type (2 for long and double, 0 for void, 1 otherwise)
     */
    public int getSize() {
        switch (type) {
            case TypeConst.T_DOUBLE:
            case TypeConst.T_LONG:
                return 2;
            case TypeConst.T_VOID:
                return 0;
            default:
                return 1;
        }
    }

}
