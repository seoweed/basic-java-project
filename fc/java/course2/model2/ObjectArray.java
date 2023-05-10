package fc.java.course2.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public ObjectArray() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public ObjectArray(int a) {
        elements = new Object[a]; // 원하는 크기의 배열을 생성
    }
    public void add(Object obj) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = obj;
    }

    private void ensureCapacity() {
        int i = elements.length * 2;
        elements = Arrays.copyOf(elements, i);
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("잘못된 값");
        }
        return elements[index];
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ObjectArray{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
