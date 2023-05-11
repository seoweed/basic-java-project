package fc.java.course2.part1;

import fc.java.course2.model2.BB;
import fc.java.course2.model2.CC;

// CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반의 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC cc = new BB();
        cc.x(); // BB의 x()가 동작 -> 동적바인딩
        cc.y(); // BB의 y()가 동작 -> 동적바인딩
        cc.z(); // BB의 z()가 동작 -> 동적바인딩
    }
}
