package fc.java.course1.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int i = add(a, b);
        System.out.println("i = " + i);


    }
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }


}
