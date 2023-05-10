package fc.java.course2.part1;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        ObjectArray objectArray = new ObjectArray();

        objectArray.add("문자열");
        objectArray.add(505);
        objectArray.add(3.14);
        objectArray.add(true);
        objectArray.add(new Book("apple", 10000, "while", "weed"));

        for (int i = 0; i < objectArray.size(); i++) {
            System.out.println(objectArray.get(i));
        }
        System.out.println(objectArray.size());
        System.out.println(objectArray.toString());


    }
}
