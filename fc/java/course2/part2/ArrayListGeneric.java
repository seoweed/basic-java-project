package fc.java.course2.part2;

import fc.java.course1.part2.Book;
import fc.java.course1.part2.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListGeneric {
    public static void main(String[] args) {
        // 타입을 정하지 않으면 안전성에 문제가 생길 수 있다.
//        ArrayList list = new ArrayList();
//        list.add(new Book("weed", 15000, "rnt", "dont", 450, "12365"));
//        list.add(5);
//        list.add(true);
//        list.add(14.5f);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(6);
        list.add(4);

    }
}
