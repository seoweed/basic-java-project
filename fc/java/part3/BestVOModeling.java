package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO movie = new MovieVO("아바타","2023-05-06", "blue man", "action", 300, 15);

        System.out.println(movie.toString());
    }
}
