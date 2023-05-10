package fc.java.course2.part1;

import fc.java.course2.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray list = new IntArray(); // 5개 크기의 배열 생성
        list.add(5);
        list.add(12);
        list.add(12);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
