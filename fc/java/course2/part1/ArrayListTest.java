package fc.java.course2.part1;

import fc.java.course2.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 자바에서 배열을 쓸때는 보통 ArrayList 를 사용 한다.
        // Book 3권을 배열에 저장하고 출력
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new Book("weed", 20, "godog", "poiweed"));
        arrayList.add(new Book("a", 2500, "godam", "wewgeed"));
        arrayList.add(new Book("b", 600, "god", "asweed"));

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

    }
}
