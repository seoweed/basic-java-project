package fc.java.course2.model2;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다식 : 코드가 간결하고 확장 구현이 쉽다.
        MathOperation add = (x, y) -> x + y;
        System.out.println(add.operation(4, 9));

        MathOperation multi = (x, y) -> x * y;
        System.out.println(multi.operation(7, 10));

    }
}
