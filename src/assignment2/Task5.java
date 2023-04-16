package assignment2;
import java.util.Queue;
import java.util.LinkedList;

public class Task5 {

    public static void main(String[] args) {
        // Initialize queue with random integers
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(6);
        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        System.out.println("Input Queue: " + queue);
        shiftQueue(queue);
        System.out.println("Output Queue: " + queue);
    }

    public static void shiftQueue(Queue<Integer> queue) {
        // Create a queue to hold the first half of the elements
        Queue<Integer> auxQueue = new LinkedList<>();
        int half = queue.size() / 2;

        // Loop through first half and enqueue to auxiliary queue
        for (int i = 0; i < half; i++) {
            auxQueue.add(queue.poll());
        }

        // Enqueue back auxiliary queue to main queue
        while (!auxQueue.isEmpty()) {
            queue.add(auxQueue.poll());
        }
    }

}
