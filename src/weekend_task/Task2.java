package weekend_task;

public class Task2 {
    public static void main(String[] args) {
        int[][] integers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        sumColumnRows(integers);
    }

    public static void sumColumnRows(int[][] integers) {
        // Keep track of column sums
        int[] columns = new int[integers[0].length];

        for (int i = 0; i < integers.length; i++) {
            int sum = 0;
            for (int j = 0; j < integers[i].length; j++) {
                // Add sum of each row
                sum += integers[i][j];
                // Add sum of column: j corresponds to column index
                columns[j] += integers[i][j];
            }
            System.out.printf("Sum of row %d: %d\n", i + 1, sum);
        }
        System.out.println();

        for (int i = 0; i < columns.length; i++) {
            System.out.printf("Sum of column %d: %d\n", i + 1, columns[i]);
        }
    }
}
