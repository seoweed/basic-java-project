package fc.java.course1.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.println(i+ "의 아스키 코드 값 = " + (int)i);
        }

        // for i
        int[] numbers = {1,20,30,4,50,6,70,8,90,10};
        for (int i = 0;i < numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        // for each
        for (int su :
             numbers) {
            System.out.println(su);
        }

    }

}
