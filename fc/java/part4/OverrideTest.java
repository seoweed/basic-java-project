package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

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
