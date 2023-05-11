package fc.java.course2.part1;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
//        String str1 = "world";
//        String str2 = "Hello";
//        if (str1.equals(str2)) {
//            System.out.println("str1 == str2");
//        } else {
//            System.out.println("str1 != str2");
//        }
//
//        int result = str1.compareTo(str2);
//        if (result == 0) {
//            System.out.println("str1 == str2");
//        } else if (result < 0) {
//            System.out.println("str1이 str2보다 낮다");
//        } else {
//            System.out.println("str1이 str2보다 높다");
//        }

//        String str3 = "hello.world.java";
//        String[] split_str3 = str3.split(".");
//        for (int i = 0; i < split_str3.length; i++) {
//            System.out.println(split_str3[i]);
//        }
//        String str4 = "i love you    good";
//        String[] split = str4.split("\\s+");
//        for (String s :
//                split) {
//            System.out.println(s);
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("문장을 입력해주세요 : ");
        String str5 = scanner.nextLine();
        String[] split_str5 = str5.split("\\s+");
        for (String s :
                split_str5) {
            System.out.println(s);
        }
    }
}
