package lsieun.bytecode.sample;

import lsieun.bytecode.gen.ClassGen;
import lsieun.bytecode.gen.ConstantPoolGen;
import lsieun.bytecode.gen.cst.AccessConst;

public class HelloWorldGen {
    public static void main(String[] args) {
        ConstantPoolGen cpg = new ConstantPoolGen();

        int access_flags = (AccessConst.ACC_PUBLIC | AccessConst.ACC_SUPER);
        ClassGen classGen = new ClassGen("lsieun.sample.HelloWorld", "java.lang.Object",
                "HelloWorld.java", access_flags, new String[0], cpg);

        System.out.println("GAME OVER");
    }
}
