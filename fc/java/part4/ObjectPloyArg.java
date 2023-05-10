package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

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
