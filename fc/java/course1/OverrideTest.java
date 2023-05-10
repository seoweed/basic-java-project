package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // upcasting
        Animal dog = new Dog();
        dog.eat();
        // upcasting
        Animal cat = new Cat();
        cat.eat();
    }

}
