package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김길동", "이길동");
        Collections.sort(names, String::compareTo);
        System.out.println(names);
        for (String s
        : names) {
            System.out.println("s = " + s);
        }
    }
}
