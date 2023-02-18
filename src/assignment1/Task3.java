package assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2};
        int[] array2 = {4, 5, 6, 3};
        int[] combinedArray = addArrays(array1, array2);
        System.out.println(Arrays.toString(combinedArray));
    }

    private static int[] addArrays(int[] array1, int[] array2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Copy first array
        for (int i: array1) {
            // Ensure no duplicates
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }
        // Copy second array
        for (int i: array2) {
            // Ensure no duplicates
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
