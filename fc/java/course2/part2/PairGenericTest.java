package fc.java.course2.part2;

import fc.java.course2.model2.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Map<String, Integer> maps = new HashMap<>();
        maps.put("weed", 40);
        maps.put("good", 20);

        Set<String> set = maps.keySet();
        for (String s :
                set) {
            System.out.println(s + " : " + maps.get(s));
        }

    }
}
