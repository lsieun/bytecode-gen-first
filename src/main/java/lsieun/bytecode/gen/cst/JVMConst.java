package lsieun.bytecode.gen.cst;

public final class JVMConst {
    /**
     * Java class file format Magic number (0xCAFEBABE)
     */
    public static final int JVM_CLASSFILE_MAGIC = 0xCAFEBABE;

    /** The name of the static initializer, also called &quot;class
     *  initialization method&quot; or &quot;interface initialization
     *   method&quot;. This is &quot;&lt;clinit&gt;&quot;.
     */
    public static final String STATIC_INITIALIZER_NAME = "<clinit>";

    /** The name of every constructor method in a class, also called
     * &quot;instance initialization method&quot;. This is &quot;&lt;init&gt;&quot;.
     */
    public static final String CONSTRUCTOR_NAME = "<init>";

    /** Maximum value for an unsigned short.
     */
    public static final int MAX_SHORT = 65535; // 2^16 - 1

    /** Maximum value for an unsigned byte.
     */
    public static final int MAX_BYTE  = 255; // 2^8 - 1

    /**
     * Maximum Constant Pool entries.
     * One of the limitations of the Java Virtual Machine.
     */
    public static final int MAX_CP_ENTRIES     = 65535;

    /**
     * Maximum code size (plus one; the code size must be LESS than this)
     * One of the limitations of the Java Virtual Machine.
     */
    public static final int MAX_CODE_SIZE      = 65536; //bytes

    /**
     * The maximum number of dimensions in an array ({@value}).
     * One of the limitations of the Java Virtual Machine.
     */
    public static final int MAX_ARRAY_DIMENSIONS = 255;


}
