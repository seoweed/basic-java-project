import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt(); // 불럭 상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        double v = scan.nextDouble();
        System.out.println("v = " + v);

        System.out.print("문자를 입력하세요 : ");
        String s = scan.next();
        System.out.println("s = " + s);

        scan.nextLine(); // 버퍼 비우기(스트림 지우기)
        System.out.print("문자열을 입력하세요 : ");
        String str = scan.nextLine();
        System.out.println("str = " + str);

        scan.close();
    }
}
