package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        // 인스턴스 메서드 참조
        StringUtils utils = new StringUtils();
        Converter<String, String> converter = utils::reverse;
        System.out.println(converter.convert("123456"));
        System.out.println(converter.convert("hello"));
    }
}
