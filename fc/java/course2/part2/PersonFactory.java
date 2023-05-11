package fc.java.course2.part2;

import fc.java.course2.model2.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);

}
