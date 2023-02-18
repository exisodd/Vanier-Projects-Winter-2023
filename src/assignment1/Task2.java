package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        String input = console.nextLine();
        ArrayList<Integer> uniqueSorted = uniqueSort(input);
        System.out.println("Your unique sorted Elements: " + uniqueSorted);
    }

    public static ArrayList<Integer> uniqueSort(String numbers) {
        ArrayList<Integer> sorted = new ArrayList<>();
        for (String s: numbers.split(" ")) {
            int i = Integer.parseInt(s);
            if (!sorted.contains(i)) {
                sorted.add(i);
            }
        }
        Collections.sort(sorted);
        return sorted;
    }
}
