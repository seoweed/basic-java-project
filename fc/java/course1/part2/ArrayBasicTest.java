package fc.java.course1.part2;

public class ArrayBasicTest {
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i<a.length;i++) {
            a[i] = 10;
            System.out.printf("a[%d] = ",i + a[i]);
        }
        System.out.println(a.length);


        int[] d = {10, 20, 30, 40, 50, 60};

        System.out.println("d[3] = " + d[3]);
    }
}
