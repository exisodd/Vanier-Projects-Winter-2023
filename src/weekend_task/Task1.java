package weekend_task;

public class Task1 {
    public static void main(String[] args) {
        int[][] integers = {
                {3, 5, 7},
                {10, 2, 9}
        };
        printColumns(integers);
    }
    public static void printColumns(int[][] integers) {
        // Loop over each column
        for (int i = 0; i < integers[0].length; i++) {
            // Loop over each row
            for (int[] ints : integers) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }
    }
}
