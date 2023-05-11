package fc.java.course2.part2;

import java.rmi.server.UID;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,3,4,5,2,2,1,10};

        Set<Integer> uniqueNums = new HashSet<>();
        for (int number :
                nums) {
            uniqueNums.add(number);
        }

        for (int number :
                uniqueNums) {
            System.out.println("number = " + number);
        }
    }
}
