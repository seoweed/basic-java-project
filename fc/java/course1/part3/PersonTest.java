package fc.java.course1.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("dark", 70, "010-4567-4567");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.phone);

        person.age = 40;
        person.name = "weed";
        person.phone = "010-1234-1234";

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.phone);

        person.eat();
        person.play();
        person.walk();
    }
}
