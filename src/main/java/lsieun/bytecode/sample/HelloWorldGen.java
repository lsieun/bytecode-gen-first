package lsieun.bytecode.sample;

import java.io.File;
import java.io.IOException;

import lsieun.bytecode.gen.ClassGen;
import lsieun.bytecode.gen.ConstantPoolGen;
import lsieun.bytecode.gen.MethodGen;
import lsieun.bytecode.gen.classfile.JavaClass;
import lsieun.bytecode.gen.classfile.MethodInfo;
import lsieun.bytecode.gen.cst.AccessConst;
import lsieun.bytecode.gen.opcode.GETSTATIC;
import lsieun.bytecode.gen.opcode.INVOKEVIRTUAL;
import lsieun.bytecode.gen.opcode.LDC;
import lsieun.bytecode.gen.opcode.RETURN;
import lsieun.bytecode.gen.utils.DumpUtils;
import lsieun.bytecode.gen.utils.InstructionList;
import lsieun.bytecode.gen.utils.TypeUtils;

public class HelloWorldGen {
    private static final String CLASSNAME = "HelloWorld";

    public static void main(String[] args) {
        ConstantPoolGen cpg = new ConstantPoolGen();

        int access_flags = (AccessConst.ACC_PUBLIC | AccessConst.ACC_SUPER);
        ClassGen classGen = new ClassGen(CLASSNAME, "java.lang.Object",
                "HelloWorld.java", access_flags, new String[0], cpg);

        // EmptyConstructor
        classGen.addEmptyConstructor(AccessConst.ACC_PUBLIC);

        // Main
        MethodInfo mainMethod = getMainMethod(cpg, "Good Job");
        classGen.addMethod(mainMethod);

        // getJavaClass
        JavaClass javaClass = classGen.getJavaClass();

        // Output
        String path = HelloWorldGen.class.getResource("/").getPath();
        String filename = path + "HelloWorld.class";

        System.out.println("file://" + filename);

        File file = new File(filename);
        try {
            DumpUtils.dumpJavaClass(javaClass, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("GAME OVER");
    }

    public static MethodInfo getMainMethod(ConstantPoolGen cpg, String str) {
        final InstructionList il = new InstructionList();
        il.append(new GETSTATIC(cpg.addFieldref("java.lang.System", "out", "Ljava/io/PrintStream;")));
        il.append(new LDC(cpg.addString(str)));
        il.append(new INVOKEVIRTUAL(cpg.addMethodref("java.io.PrintStream", "println", "(Ljava/lang/String;)V")));
        il.append(new RETURN());

        final MethodGen mg = new MethodGen(AccessConst.ACC_PUBLIC | AccessConst.ACC_STATIC, TypeUtils.VOID, TypeUtils.STR_ARGS, null, "main",
                CLASSNAME, il.getByteCode(), 3, 3, cpg);
        MethodInfo methodInfo = mg.getMethod();
        return methodInfo;
    }
}
