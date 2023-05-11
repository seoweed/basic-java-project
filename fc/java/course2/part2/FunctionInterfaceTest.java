package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();
        System.out.println(mo.operation(10, 20));
    }

    // 인터페이스를 구현한 구현체를 내부에 만들어 놓고 사용하는 방법
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
