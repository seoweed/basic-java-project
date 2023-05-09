package fc.java.model;

public class AllStatic {

    private AllStatic() {
    }

    public static int hap(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
