package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.TV;

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
