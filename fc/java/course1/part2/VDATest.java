package fc.java.course1.part2;

public class VDATest {
    public static void main(String[] args) {
        // 정수 한 개 변수 선언
        int v;
        v = 10;
        System.out.println("v = " + v);
        // 정수의 합
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);
        // 누적
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println("sum = " + sum);
        // x = 10, y = 20 서로 교환(swap)
        int x = 10;
        int y = 20;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + ", y = " + y);

        String str1 = "aabbcc";
    }
}
