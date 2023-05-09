package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest extends Animal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();


        Animal cat = new Cat();
        cat.eat();

    }

}
