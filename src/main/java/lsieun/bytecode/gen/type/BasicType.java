package lsieun.bytecode.gen.type;

import lsieun.bytecode.gen.cst.TypeConst;
import lsieun.bytecode.gen.utils.TypeUtils;

public final class BasicType extends Type {

    public BasicType(final byte type) {
        super(type, TypeConst.getShortTypeName(type));
        if ((type < TypeConst.T_BOOLEAN) || (type > TypeConst.T_VOID)) {
            throw new RuntimeException("Invalid type: " + type);
        }
    }

    public static BasicType getType(final byte type) {
        switch (type) {
            case TypeConst.T_VOID:
                return TypeUtils.VOID;
            case TypeConst.T_BOOLEAN:
                return TypeUtils.BOOLEAN;
            case TypeConst.T_BYTE:
                return TypeUtils.BYTE;
            case TypeConst.T_SHORT:
                return TypeUtils.SHORT;
            case TypeConst.T_CHAR:
                return TypeUtils.CHAR;
            case TypeConst.T_INT:
                return TypeUtils.INT;
            case TypeConst.T_LONG:
                return TypeUtils.LONG;
            case TypeConst.T_DOUBLE:
                return TypeUtils.DOUBLE;
            case TypeConst.T_FLOAT:
                return TypeUtils.FLOAT;
            default:
                throw new RuntimeException("Invalid type: " + type);
        }
    }
}
