package fc.java.part4;

import fc.java.poly.RemoCon;
import fc.java.poly.TV;

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
