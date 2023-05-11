package fc.java.course2.part2;

import java.io.ObjectOutput;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        System.out.println(set.size());

        for (String s :
                set) {
            System.out.println("s = " + s);
        }
        System.out.println();

        set.remove("banana");
        for (String s :
                set) {
            System.out.println("s = " + s);
        }
        System.out.println();
        boolean contains = set.contains("apple");
        System.out.println("contains = " + contains);

        set.clear();
        System.out.println("Empty = " + set.isEmpty());
    }
}
