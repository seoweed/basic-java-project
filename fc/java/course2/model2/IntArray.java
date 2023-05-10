package fc.java.course2.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;
    // 생성동작
    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }
    // 저장동작
    public void add(int element) {
        if (size == elements.length) {
            // 크기 2배로
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // 얻는 동작
    public int get(int index) {

        return elements[index];
    }
    // 갯수
    public int size() {
        return size;
    }
}
