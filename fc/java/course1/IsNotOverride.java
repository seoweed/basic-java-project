package fc.java.course1.part4;

import fc.java.course1.poly.Animal;
import fc.java.course1.poly.Cat;
import fc.java.course1.poly.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의(override)를 하지 않으면 오동작을 함
        // 다형성을 보장하지 않음 -> 재정의를 안해도 오류가 안남
        // 추상클래스, 인터페이스 등장
        // 다형성이 보장이 된다. -> 재정의를 무조건 해야되기 때문
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
    }
}
