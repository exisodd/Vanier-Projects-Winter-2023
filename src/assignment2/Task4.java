package assignment2;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, -9, 2, 11, 9, 30, 44, -5, 17);
        System.out.println("Original list: " + numbers);

        // Cube and filter and average
        numbers = cubeFilter(numbers);
        double average = findAverage(numbers);
        System.out.println("Cube and filtered >500 list: " + numbers);
        System.out.println("Average of new list: " + average);
    }

    public static List<Integer> cubeFilter (List<Integer> list) {
        // Returns new list with numbers cubed and filter over 500
        return list.stream()
                .map(n -> n * n * n)
                .filter(n -> n > 500)
                .toList();
    }

    public static double findAverage(List<Integer> list) {
        // Returns average of list of Integers
        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // Default value if list is empty
    }
}
