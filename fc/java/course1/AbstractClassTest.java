package fc.java.course1.part4;

import fc.java.course1.poly.Animal;
import fc.java.course1.poly.Cat;
import fc.java.course1.poly.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
//        추상클래스는 직접 객체를 생성할수 없다
//        Animal animal = new Animal();
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
