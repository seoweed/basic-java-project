package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        // 문자열을 정수형 타입으로 변환
        String str1 = "123";
        String str2 = "123";

        String s = str1 + str2;
        System.out.println("s = " + s);
        int str1_int = Integer.parseInt(str1);
        int str2_int = Integer.parseInt(str2);
        System.out.println("str1_int = " + str1_int);
        int i = str1_int + str2_int;
        System.out.println("i = " + i);
        System.out.println();

        // 정수형을 문자열 타입으로 변환
        // 방법 1
        int su1 = 123;
        int su2 = 123;
        int i1 = su1 + su2;
        System.out.println("i1 = " + i1);
        String su1_str = String.valueOf(su1);
        String su2_str = String.valueOf(su2);
        String s1 = su1_str + su2_str;
        System.out.println("s1 = " + s1);
        // 방법 2
        String num1 = "" + su1;
        String num2 = "" + su2;
        System.out.println(num1 + num2);

    }
}
