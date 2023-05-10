package fc.java.course2.part1;

import fc.java.course2.model2.Book;

import java.util.ArrayList;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // ArrayList에 특정 타입만 넣고싶을 때 <> (제네릭) 사용
        // 같은 타입이니까 다운캐스팅을 할 필요가 없다
        ArrayList<Book> arrayList = new ArrayList<Book>(10);
        arrayList.add(new Book("weed", 20, "godog", "poiweed"));
        arrayList.add(new Book("a", 2500, "godam", "wewgeed"));
        arrayList.add(new Book("b", 600, "god", "asweed"));

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
}
