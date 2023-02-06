package weekend_task;

public class Task3 {
    public static void main(String[] args) {
        int[][] integers = {
                {1, 10, 3, 8},
                {9, 12, 6, 7},
                {5, 2, 11, 4}
        };
        maxRow(integers);
    }

    public static void maxRow(int[][] integers) {
        for (int i = 0; i < integers.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j: integers[i]) {
                // Get max value of each row
                max = Math.max(max, j);
            }
            System.out.printf("Max of row %d: %d\n", i + 1, max);
        }
    }
}
