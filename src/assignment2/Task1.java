package assignment2;

import java.util.Random;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        // Initialize tree set with random numbers between 1 and 200
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(150);
            treeSet.add(randomNumber);
        }

        // Find numbers between 50 and 100 and print result
        TreeSet<Integer> resultTreeSet = findNums(treeSet);
        System.out.println("Complete tree set set: " + treeSet);
        System.out.print("Numbers greater than 50 and less than 100: " + resultTreeSet);
    }

    public static TreeSet<Integer> findNums(TreeSet<Integer> inputSet) {
        // Returns a new tree set with numbers less than 100 and greater than 50
        TreeSet<Integer> filteredSet = new TreeSet<>();
        for (int num : inputSet) {
            if (num > 50 && num < 100) {
                filteredSet.add(num);
            }
        }
        return filteredSet;
    }
}
