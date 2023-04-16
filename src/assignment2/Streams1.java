package assignment2;

import java.util.Arrays;
import java.util.List;

public class Streams1 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("sakku", "Vanier", "test", "Test",
                                           "Sakku", "Montreal");
        List<String> result = lines.stream()
                .filter(s -> !s.equalsIgnoreCase("Sakku"))
                .filter(s -> !s.equalsIgnoreCase("Test"))
                .toList();
        result.forEach(System.out::println);
    }
}
