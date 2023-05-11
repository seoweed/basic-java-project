package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장
        int a = 10; // 기본 자료형
        Integer aa = new Integer(10); // 사용자 정의 자료형
        Integer aaa = 50; // Auto-boxing
        System.out.println(aaa.intValue()); // unboxing(integer -> int)

        Integer bb = 20; // auto boxing
        int b = bb; // auto unboxing
        System.out.println("b = " + b);
        System.out.println(bb);

        float f = 10.5f;
//        Float ff = new Float(10.105f);
        Float ff = 10.105f; // auto boxing
    }
}
