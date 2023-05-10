package fc.java.course1.part4;

import fc.java.course1.poly.A;
import fc.java.course1.poly.B;

public class ObjectPloyArray {
    public static void main(String[] args) {
        // 다형성 배열 1줄 / 2줄
//        Object[] obj = {new A(), new B()};

        Object[] obj = new Object[2];
        obj[0] = new A();
//        ((A)obj[0]).printGo();
        obj[1] = new B();
//        ((B)obj[1]).printGo();

        display(obj);
    }

    private static void display(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A) {
                ((A) obj[i]).printGo();
            } else {
                ((B) obj[i]).printGo();
            }
        }
    }
}
