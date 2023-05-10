package fc.java.course2.part1;

public class IntArrayBasic {
    public static void main(String[] args) {
        int[] a = new int[5]; // 고정길이 -> 단점
        a[0] = 5; // 저장 동작
        a[1] = 8;
        a[2] = 10;
        a[3] = 13;
        a[4] = 15;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
