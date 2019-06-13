package lsieun.bytecode.gen.utils;

import lsieun.bytecode.gen.cst.TypeConst;
import lsieun.bytecode.gen.type.*;

public class TypeUtils {
    /**
     * Predefined constants
     */
    public static final BasicType VOID = new BasicType(TypeConst.T_VOID);
    public static final BasicType BOOLEAN = new BasicType(TypeConst.T_BOOLEAN);
    public static final BasicType INT = new BasicType(TypeConst.T_INT);
    public static final BasicType SHORT = new BasicType(TypeConst.T_SHORT);
    public static final BasicType BYTE = new BasicType(TypeConst.T_BYTE);
    public static final BasicType LONG = new BasicType(TypeConst.T_LONG);
    public static final BasicType DOUBLE = new BasicType(TypeConst.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(TypeConst.T_FLOAT);
    public static final BasicType CHAR = new BasicType(TypeConst.T_CHAR);
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
    public static final ObjectType STRING = new ObjectType("java.lang.String");
    public static final ObjectType STRINGBUFFER = new ObjectType("java.lang.StringBuffer");
    public static final ObjectType THROWABLE = new ObjectType("java.lang.Throwable");
    public static final Type[] NO_ARGS = new Type[0]; // EMPTY, so immutable
    public static final Type[] STR_ARGS = new Type[] {new ArrayType("java.lang.String", 1)};
    public static final ReferenceType NULL = new ReferenceType() {
    };
    public static final Type UNKNOWN = new Type(TypeConst.T_UNKNOWN, "<unknown object>") {
    };

    public static ObjectType getInstance(final String class_name) {
        return new ObjectType(class_name);
    }


    public static String getMethodSignature(final Type return_type, final Type[] arg_types) {
        final StringBuilder buf = new StringBuilder("(");
        if (arg_types != null) {
            for (final Type arg_type : arg_types) {
                buf.append(arg_type.getSignature());
            }
        }
        buf.append(')');
        buf.append(return_type.getSignature());
        return buf.toString();
    }
}
