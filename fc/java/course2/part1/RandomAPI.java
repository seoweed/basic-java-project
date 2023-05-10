package fc.java.course2.part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[6];
        int i = 0;

        while (i < 6) {
            int num = random.nextInt(45) + 1;
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[i++] = num;
            }
        }
        for (int num:
        arr){
            System.out.print(num + " ");
        }
    }
}
