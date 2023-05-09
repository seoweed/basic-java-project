package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class polyTest {
    public static void main(String[] args) {

        /* 다형성 전제 조건
        1. override(재정의)
        2. 상속 관계
        3.upcasting(업캐스팅)
        4. 동적 바인딩(컴파일 시점에서 정해지는 것)

        overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정 됨
        override(재정의) : 동적바인딩 = 실행 시점에서 사용될 메서드가 결정되는 바인딩
        */
        Dog dog = new Dog();
        dog.eat();
        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.night();
        System.out.println();

        Animal animal1 = new Dog();
        animal1.eat();
        System.out.println();

        Animal animal2 = new Cat();
        animal2.eat();
        System.out.println();

        ((Cat)animal2).night();
        System.out.println();

        Cat c = (Cat) animal2;
        c.eat();
        c.night();
        System.out.println();


    }
}
