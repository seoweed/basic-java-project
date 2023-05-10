package fc.java.course1.part4;

import fc.java.course1.poly.A;
import fc.java.course1.poly.B;

public class ObjectPloyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }


    private static void display(Object o) {
        if (o instanceof A) {
            ((A)o).printGo();
        } else {
            ((B)o).printGo();
        }
    }
}
