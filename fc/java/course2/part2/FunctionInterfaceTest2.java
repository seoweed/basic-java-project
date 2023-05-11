package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        // MathOperation (함수형)인터페이스를 내부 익명 클래스로 구현
        // 이렇게 구현하면 인터페이스는 존재하지만 구현 클래스는 존재하지 않는다.(익명 내부 클래스)
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };
        System.out.println(mo.operation(5, 10));
    }
}
