package test2;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Element to be found : ");
        int element = console.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> 0);
        priorityQueue.add(44);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(100);
        priorityQueue.add(564);
        priorityQueue.add(3);
        priorityQueue.add(44);
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(44);
        priorityQueue.add(200);
        ArrayList<Integer> indexes = new ArrayList<>();
        int i = 0;
        for (int num: priorityQueue) {
            if (num == element) {
                indexes.add(i);
            }
            i++;
        }
        System.out.println(indexes);
    }
}
