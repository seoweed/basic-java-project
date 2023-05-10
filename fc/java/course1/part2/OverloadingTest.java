package fc.java.course1.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(3.14f, 5.0f);
        System.out.println("v = " + v);

        // 이미 만들어져 있는 메서드 사용
        String a = "apple";
        char c = a.charAt(2);
        int length = a.length();
        String s = a.toUpperCase();
        System.out.println("s = " + s);
        System.out.println("length = " + length);
        System.out.println("c = " + c);
    }
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float add(float a, float b) {
        float sum = a + b;
        return sum;
    }
    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

}
