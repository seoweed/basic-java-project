package fc.java.course2.part2;

import fc.java.course2.model2.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.7};

        AverageCalculator<Integer> calculator = new AverageCalculator<>(integers);
        System.out.println(calculator.calculateAverage());

        AverageCalculator<Double> calculator1 = new AverageCalculator<>(doubles);
        System.out.println(calculator1.calculateAverage());

    }
}
