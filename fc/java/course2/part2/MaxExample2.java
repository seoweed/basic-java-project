package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxExample2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry","orange");
        List<String> collect = words.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
