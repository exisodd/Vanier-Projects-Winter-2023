package weekend_task;

public class Task4 {
    public static void main(String[] args) {
        int[] integers = {1, 1, 1, 2, 3, 4};
        printOccurrence(integers);
    }

    public static void printOccurrence(int[] integers) {
        // Find max value in array
        int max = Integer.MIN_VALUE;
        for (int i: integers) {
            max = Math.max(max, i);
        }
        // Create new array to keep track of occurrence
        int[] occurrence = new int[max + 1];
        for (int i: integers) {
            occurrence[i]++;
        }

        // Loop over each number and print occurrence
        for (int i = 0; i < occurrence.length; i++) {
            if (occurrence[i] > 0) {
                System.out.printf("%d repeated %d %s\n", i, occurrence[i], occurrence[i] == 1 ? "time" : "times");
            }
        }
    }
}
