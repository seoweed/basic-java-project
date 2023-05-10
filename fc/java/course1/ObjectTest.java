package fc.java.course1.part4;

import fc.java.course1.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        A a = new A();

        Object ob = new A(); // UpCasting

        ((A)ob).display(); // DownCasting
    }
}
