package fc.java.course1.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int i = scanner.nextInt();

        if (i > 0) {
            System.out.println(i + " : 양수입니다");
        } else if (i == 0) {
            System.out.println(i + " : 0입니다");
        } else {
            System.out.println(i + " : 음수입니다");
        }
        System.out.println("다음");

        System.out.print("정수를 입력해주세요 : ");
        int j = scanner.nextInt();

        if (j % 7 == 0) {
            System.out.println(j + " : 7의 배수입니다");
        } else {
            System.out.println(j + " : 7의 배수가 아닙니다");
        }
        System.out.println("종료");



    }

}
