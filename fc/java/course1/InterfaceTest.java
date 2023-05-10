package fc.java.course1.part4;

import fc.java.course1.poly.Radio;
import fc.java.course1.poly.RemoCon;
import fc.java.course1.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
        System.out.println();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
