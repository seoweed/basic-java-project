package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class PloyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

//        Animal[] ani = {new Dog(), new Cat()};

        Animal[] ani = new Animal[2];
        ani[0] = new Dog();
        ani[1] = new Cat();
        display(ani);
    }

    private static void display(Animal[] ani) {
        for (int a = 0; a < ani.length; a++) {
            ani[a].eat();
            if (ani[a] instanceof Cat) {

                ((Cat) ani[a]).night();
            }
        }
    }
}
