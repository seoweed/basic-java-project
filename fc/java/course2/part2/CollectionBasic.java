package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList 10,20,30,40,50 5개의 정수를 저장하고 출력하세요
        // ArrayList -> Object[] 가 들어가기 때문에 오브젝트 객체만이 들어갈 수 있다.
        // 따라서 기본자료형인 int는 객체가 아니기 때문에 들어갈 수 없다.
        // 하지만 ArrayList에 값을 넣을 때 자동으로 auto boxing 이 일어나기 때문에 int가 들어갈 수 있다.
        ArrayList<Integer> arrayList = new ArrayList<>(); // 제네릭 사용
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        for (int s :
                arrayList) {
            System.out.println(s );
        }


    }
}
