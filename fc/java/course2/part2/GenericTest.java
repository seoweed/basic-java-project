package fc.java.course2.part2;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.Movie;
import fc.java.course2.model2.ObjectArr;
// 제네릭을 사용하는 이유는 재사용성을 높이기 위함과 다른 타입의 객체가 들어오는것을 방지해주기 때문에
// 코드의 안정성이 높아진다. 다양한 데이터 타입에 적용 할 수 있다.
public class GenericTest {
    public static void main(String[] args) {
        // 타입을 String 으로 설정
//        ObjectArr<String> arr = new ObjectArr<>(5);
//        arr.set(0, "weed");
//        arr.set(1, "hello");
//        arr.set(2, "world");
//        arr.set(3, "java");
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//
//        System.out.println(arr.size());
        // 타입을 Movie 로 설정
        ObjectArr<Movie> list = new ObjectArr<>(5);
        list.set(0, new Movie("기생충", "weed", "2023", "korea"));
        list.set(1, new Movie("괴물", "봉준호", "2013", "korea"));
        list.set(2, new Movie("완벽한 타인", "몰라", "2050", "korea"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size());
    }
}
