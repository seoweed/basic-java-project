package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.Person;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("weed", 50);
        System.out.println("person = " + person);
    }
}
