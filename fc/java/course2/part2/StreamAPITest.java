package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] a =  {1, 2, 3, 4, 5};
        int sum = Arrays.stream(a)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sum = " + sum);

        int[] ints = Arrays.stream(a)
                .filter(n -> n % 2 == 0)
                .toArray();
        for (int i :
                ints) {
            System.out.println("i = " + i);
        }

    }
}
