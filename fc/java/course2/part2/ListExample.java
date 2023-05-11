package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("banana");

        for (String s :
                arrayList) {
            System.out.println("s = " + s);
        }

        System.out.println(arrayList.size());

        arrayList.remove(0);

        for (String s :
                arrayList) {
            System.out.println("s = " + s);
        }
        System.out.println();
        arrayList.set(1, "banana");
        for (String s :
                arrayList) {
            System.out.println("s = " + s);
        }


    }
}
