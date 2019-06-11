package lsieun.bytecode.gen.cst;

public class AccessConst {
    public static final int TYPE_CLASS = 1;
    public static final int TYPE_FIELD = 2;
    public static final int TYPE_METHOD = 3;

    public static final int ACC_PUBLIC    = 0x0001;
    public static final int ACC_PRIVATE   = 0x0002;
    public static final int ACC_PROTECTED = 0x0004;
    public static final int ACC_STATIC    = 0x0008;
    public static final int ACC_FINAL     = 0x0010;
    public static final int ACC_SYNCHRONIZED = 0x0020;
    public static final int ACC_VOLATILE  = 0x0040;
    public static final int ACC_BRIDGE    = 0x0040;     // for method_info
    public static final int ACC_TRANSIENT = 0x0080;
    public static final int ACC_VARARGS   = 0x0080;     // for method_info
    public static final int ACC_NATIVE    = 0x0100;
    public static final int ACC_INTERFACE = 0x0200;
    public static final int ACC_ABSTRACT  = 0x0400;
    public static final int ACC_STRICT    = 0x0800;
    public static final int ACC_SYNTHETIC = 0x1000;
    public static final int ACC_ANNOTATION = 0x2000;
    public static final int ACC_ENUM      = 0x4000;
    public static final int ACC_MANDATED  = 0x8000;

    // Note: 0x0020 is assigned to both ACC_SUPER and ACC_SYNCHRONIZED
    // although java.lang.reflect.Modifier does not recognize ACC_SUPER.
    public static final int ACC_SUPER     = 0x0020;
    public static final int ACC_MODULE    = 0x8000;

    /**
     * The names of the access flags.
     */
    private static final String[] ACCESS_NAMES = {
            "public", "private", "protected", "static", "final", "synchronized",
            "volatile", "transient", "native", "interface", "abstract", "strictfp",
            "synthetic", "annotation", "enum"
    };

    public static final int ACCESS_NAMES_LENGTH = ACCESS_NAMES.length;

    /**
     * @param index
     * @return the ACCESS_NAMES entry at the given index
     */
    public static String getAccessName(final int index) {
        return ACCESS_NAMES[index];
    }

}
