package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {

        PersonVO person = new PersonVO("weed", 80, "010-1234-5678");

//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//        System.out.println(person.getNumber());
//        System.out.println(person.getClass());

        System.out.println(person.toString());
        System.out.println(person);
    }

}
