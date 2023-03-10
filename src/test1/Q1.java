package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Create arbitrary arraylist
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> exampleList = new ArrayList<>();
        exampleList.add(3);
        exampleList.add(11);
        exampleList.add(26);
        exampleList.add(12);
        exampleList.add(99);
        exampleList.add(345);
        exampleList.add(36);
        exampleList.add(5);
        exampleList.add(18);

        // User input and replace
        System.out.println("Array List Elements: " + exampleList);
        System.out.print("Enter the number to be replaced: ");
        int numReplace = console.nextInt();
        for (int i = 0; i < exampleList.size(); i++) {
            if (i % 2 != 0) {
                exampleList.set(i, numReplace);
            }
        }

        // Display output
        System.out.println("Output: " + exampleList);
    }
}
