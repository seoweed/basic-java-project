public class LoopLoopTest {
    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            System.out.println(j +"단");
            for (int i = 1; i < 10; i++) {
                System.out.println(j +" x " + i + " = " + i * j);
            }
            System.out.println();
        }
    }
}
