package assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 4, 5, 5, 6, 7, 7};
        Scanner console = new Scanner(System.in);
        int input;
        do {
            // Prompt menu program for user interaction
            System.out.println("Input an option to do one of the following tasks: ");
            String[] options = {"add an element", "find all repeated elements", "display size of array",
                    "display which element has repeated most number of times", "remove an element", "sort the array",
                    "display", "exit"};
            for (int i = 0; i < options.length; i++) {
                System.out.printf("    -Enter %d to %s\n", i, options[i]);
            }
            input = console.nextInt();
            console.nextLine();

            // Map corresponding options to user input
            int element;
            switch (input) {
                case 0 -> {
                    System.out.print("What element would you like to add?");
                    element = console.nextInt();
                    console.nextLine();
                    arr = addElement(arr, element);
                    System.out.printf("Successfully added %d to the array\n", element);
                }
                case 1 -> System.out.printf("The repeated elements are: %s\n", findRepeatedElements(arr));
                case 2 -> System.out.printf("The array has %d elements\n", sizeOf(arr));
                case 3 -> System.out.printf("%d has been repeated the most amount of times\n", greatestOccurrence(arr));
                case 4 -> {
                    System.out.print("What element would you like to remove?");
                    element = console.nextInt();
                    console.nextLine();
                    arr = removeElement(arr, element);
                    System.out.printf("Successfully removed %d from the array\n", element);
                }
                case 5 -> {
                    sort(arr);
                    System.out.println("Successfully sorted array.");
                }
                case 6 -> System.out.println(Arrays.toString(arr));
                case 7 -> {
                    System.out.println("Goodbye!");
                    input = -1;
                }
            }
        } while (input != -1);
    }

    public static int[] addElement(int[] arr, int element) {
        int[] array = new int[arr.length + 1];
        // Copy each element individually
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        // Add element to end of array
        array[arr.length] = element;
        return array;
    }

    public static int[] removeElement(int[] arr, int element) {
        int[] array = new int[arr.length - 1];
        // Copy each element individually
        for (int i = 0, j = 0; i < arr.length; i++) {
            // If element is removed element, skip to next iteration
            if (arr[i] == element) {
                continue;
            }
            array[j] = arr[i];
            j++;
        }
        return array;
    }
    public static ArrayList<Integer> findRepeatedElements(int[] arr) {
        ArrayList<Integer> repeated = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Skip item to avoid looping over same item
                if (i == j) {
                    continue;
                }
                // If matched, that means element is repeated more than once
                if (arr[i] == arr[j]) {
                    // Append to list if item is not already included
                    if (!repeated.contains(arr[i])) {
                        repeated.add(arr[i]);
                    }
                }
            }
        }
        return repeated;
    }

    public static int sizeOf(int[] arr) {
        return arr.length;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static int greatestOccurrence(int[] arr) {
        int best = 0;
        int bestOccurrence = 0;
        // Loop over each element
        for (int i: arr) {
            int currentOccurrence = 0;
            // Second loop to find number of repetitions
            for (int j: arr) {
                if (j == i) {
                    currentOccurrence++;
                }
                // If current occurrence is better than max, update values
                if (currentOccurrence > bestOccurrence) {
                    bestOccurrence = currentOccurrence;
                    best = i;
                }
            }
        }
        return best;
    }
}
