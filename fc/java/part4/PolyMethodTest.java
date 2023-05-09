package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        display(d);
        display(c);


    }
    // 다형성 인수
    public static void display(Animal ani) {
        System.out.println("animal = " + ani);
        ani.eat();
        // Cat 타입으로 받은 경우에만 실행해야 됨 --> if 문을 사용할 생각을 해야됨
        //((Cat)ani).night();

        if (ani instanceof Cat) {
            ((Cat)ani).night();
        }
    }

}
