package assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = {5, 5, 4, 3, 2, 3, 2};
        int option;
        do {
            // Prompt menu program for user interaction
            System.out.println("Input an option to do one of the tasks: ");
            String[] options = {"add an element", "find all repeated elements",
                    "display size of array", "display which element has " +
                    "repeated most number of times", "remove an element",
                    "sort the array", "display", "exit"};
            for (int i = 0; i < options.length; i++) {
                System.out.printf("   - Enter %d to %s\n", i, options[i]);
            }
            option = console.nextInt();
            console.nextLine();

            // Map corresponding options to user option
            int element;
            switch (option) {
                case 0:
                    System.out.print("What element would you like to add? ");
                    element = console.nextInt();
                    console.nextLine();
                    arr = addElement(arr, element);
                    System.out.printf("Added %d to the array.\n", element);
                    break;
                case 1:
                    System.out.printf("The repeated elements are: %s\n",
                                      findRepeatedElements(arr));
                    break;
                case 2:
                    System.out.printf("Array has %d elements.\n", sizeOf(arr));
                    break;
                case 3:
                    System.out.printf("%d has been repeated the most amount " +
                                      "of times.\n", greatestOccurrence(arr));
                    break;
                case 4:
                    System.out.print("What element would you like to remove? ");
                    element = console.nextInt();
                    console.nextLine();
                    arr = removeElement(arr, element);
                    System.out.printf("Removed %d from the array.\n", element);
                    break;
                case 5:
                    Arrays.sort(arr);
                    System.out.println("Successfully sorted array.");
                    break;
                case 6:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 7:
                    System.out.print("Goodbye!");
                    option = -1;
                    break;
            }
        } while (option != -1);
    }

    public static int[] addElement(int[] arr, int element) {
        // Create new copy of array
        int[] array = Arrays.copyOf(arr, arr.length + 1);
        // Add element to end of array
        array[arr.length] = element;
        return array;
    }

    public static int[] removeElement(int[] arr, int element) {
        int[] array = new int[arr.length - 1];
        // Keep track if an element has already been removed
        boolean notRemoved = true;
        // Copy each element individually
        for (int i = 0, j = 0; i < arr.length; i++) {
            // If element is removed element and an element
            // has not yet been removed, skip to next iteration
            if (arr[i] == element && notRemoved) {
                notRemoved = false;
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
