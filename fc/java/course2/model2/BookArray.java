package fc.java.course2.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Book[] elements;
    private int size = 0;

    public BookArray() {
        elements = new Book[DEFAULT_CAPACITY];
    }

    public void add(Book book) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = book;
    }

    private void ensureCapacity() {
        int i = elements.length * 2;
        elements = Arrays.copyOf(elements, i);
    }

    public Book get(int index) {
        if (0 > index || index >= size) {
            throw new ArrayIndexOutOfBoundsException("잘못된 인덱스 값입니다.");
        }
        return elements[index];
    }
    public int size() {
        return size;
    }
}
