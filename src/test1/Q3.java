package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(22);
        myList.add(13);
        myList.add(45);
        myList.add(10);
        myList.add(22);
        myList.add(22);
        myList.add(10);
        myList.add(2);
        myList.add(44);
        myList.add(77);
        myList.add(22);
        myList.add(100);
        myList.add(2);
        System.out.print("Input: ");
        int num = console.nextInt();

        List<Integer> indexes = findIndexes(myList, num);
        System.out.println("Output: " + indexes);
    }
    public static List<Integer> findIndexes(List<Integer> list, int num) {
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                finalList.add(i);
            }
        }
        return finalList;
    }
}
