package fc.java.course1.part4;

import fc.java.course1.poly.RemoCon;
import fc.java.course1.poly.TV;

public class Test {
    public static void main(String[] args) {
        RemoCon remo = new TV();
//        for (int i = 0; i < 68; i++) {
//            remo.chUp();
//        }
        for (int i =0; i < 100; i++) {
            remo.chDown();

        }
    }
}
