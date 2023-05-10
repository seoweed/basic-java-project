package fc.java.course2.part1;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.BookArray;

public class BookArrayTest {
    public static void main(String[] args) {
        BookArray bookArray = new BookArray();
        bookArray.add(new Book("홍길동전", 15000, "한빛", "미상"));
        bookArray.add(new Book("동화", 8000, "개인", "weed"));
        bookArray.add(new Book("지구환경", 20000, "지구", "good"));
        bookArray.add(new Book("홍길동전", 15000, "한빛", "미상"));
        bookArray.add(new Book("동화", 8000, "개인", "weed"));
        bookArray.add(new Book("지구환경", 20000, "지구", "good"));

        System.out.println(bookArray.get(0));
        System.out.println(bookArray.get(1));
        System.out.println(bookArray.get(2));
        System.out.println(bookArray.get(3));
        System.out.println(bookArray.get(4));
        System.out.println(bookArray.get(5));

        System.out.println(bookArray.get(10));

        System.out.println(bookArray.size());
    }
}
