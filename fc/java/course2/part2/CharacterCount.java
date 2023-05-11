package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello,World";
        Map<Character, Integer> chr = new HashMap<>(); // hashMap 생성
        char[] strArray = str.toCharArray(); // char 배열로 변경
        for (char c : strArray) {
            if (chr.containsKey(c)) {
                chr.put(c, chr.get(c) + 1);
            } else {
                chr.put(c, 1);
            }
        }
        for (char c :
                chr.keySet()) {
            System.out.println(c + " = " + chr.get(c));
        }

    }
}
