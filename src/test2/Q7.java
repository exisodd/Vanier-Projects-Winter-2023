package test2;

import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 9, 2, 13, 22);
        List<Integer> cubeAndFilter = list.stream()
                .map(n -> n * n * n)
                .filter(n -> n >= 500)
                .toList();
        System.out.println("Cube and filtered list: " + cubeAndFilter);
        double average = cubeAndFilter.stream()
                .mapToDouble(Double::valueOf)
                .average()
                .orElse(Double.NaN);
        System.out.println("Average: " + average);
    }
}
