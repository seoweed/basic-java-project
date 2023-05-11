package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;
import fc.java.course2.model2.MathOperationImpl;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        System.out.println(mo.operation(3, 80));
    }
}
