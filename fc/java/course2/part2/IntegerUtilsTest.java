package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        // 정적 메서드 참조
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        System.out.println(converter.convert("12586"));

    }
}
