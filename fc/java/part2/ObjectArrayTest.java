package fc.java.part2;

public class ObjectArrayTest {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        Book[] books = new Book[3];
        books[0] = new Book();
        books[0].setTitle("ant");
        System.out.println(books[0].getTitle());
    }
}
