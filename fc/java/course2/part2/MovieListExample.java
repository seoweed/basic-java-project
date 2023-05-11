package fc.java.course2.part2;

import fc.java.course2.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("기생충", "weed", "2023", "korea"));
        list.add(new Movie("괴물", "봉준호", "2013", "korea"));
        list.add(new Movie("완벽한 타인", "몰라", "2050", "korea"));

//        for (Movie m :
//                list) {
//            System.out.println(m);
//        }
//
//        System.out.println("-------------------------");
//        System.out.println("---영화감독---감독-------개봉년도------국가--");
//        for (Movie m :
//                list) {
//            System.out.printf("%s, %s, %s, %s\n",m.getTitle(), m.getDirector(), m.getYear(), m.getCountry());
//        }
//        System.out.println("-------------------------");

        String searchTitle = "기생충";
        // 순차 , 이진 검생
        for (Movie m :
                list) {
            if (searchTitle.equals(m.getTitle())) {
                System.out.println(m.getDirector());
                System.out.println(m.getYear());
                System.out.println(m.getCountry());
            }
        }
    }
}
