package assignment2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> defaultMap = new TreeMap<>();
        Map<String, Integer> lastNameSorted = new TreeMap<>(new LastNameComparator());

        // Add some <K, V> pairs, where K is first and last name and V is age
        defaultMap.put("Ethan Tran", 39);
        defaultMap.put("Alice Wonderland", 11);
        defaultMap.put("Lee Jamal", 57);
        defaultMap.put("Bob Johnson", 35);
        defaultMap.put("Charlie Phelps", 79);
        defaultMap.put("Zack Addams", 79);
        lastNameSorted.putAll(defaultMap);

        // Print the sorted keys with their corresponding values
        System.out.println("Tree map sorted with default ordering: ");
        for (String key : defaultMap.keySet()) {
            System.out.printf("\t- %s : %s\n", key, defaultMap.get(key));
        }

        // Print the sorted keys according to last name values
        System.out.println("Tree map sorted according to last name ordering: ");
        for (String key : lastNameSorted.keySet()) {
            System.out.printf("\t- %s : %s\n", key, defaultMap.get(key));
        }

    }

    // Custom Comparator to sort keys by last name
    public static class LastNameComparator implements Comparator<String> {
        @Override
        public int compare(String person1, String person2) {
            // Extract the last names from the keys
            String lastName1 = person1.split(" ")[1];
            String lastName2 = person2.split(" ")[1];

            // Compare the last names lexicographically
            return lastName1.compareTo(lastName2);
        }
    }
}
