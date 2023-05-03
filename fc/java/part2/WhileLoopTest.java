package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        int[] numbers = {1,20,30,4,50,6,70,8,90,10};
        int i = 0;
        while (i<numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        do {
            System.out.println(numbers[i]);
            i++;
        } while (i<numbers.length);
    }
}
