package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> strScore = new HashMap<>();
        strScore.put("Kim", 95);
        strScore.put("Lee", 85);
        strScore.put("Park", 40);
        strScore.put("Choi", 79);

        System.out.println(strScore.get("Kim"));

        strScore.remove("Kim");
        System.out.println(strScore.get("Kim"));

        for (Map.Entry<String, Integer> entry : strScore.entrySet()) {
            System.out.print("entry.getKey() = " + entry.getKey());
            System.out.println(", entry.getValue() = " + entry.getValue());
        }
    }
}
