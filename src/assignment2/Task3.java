package assignment2;

import static java.lang.Math.min;

public class Task3 {
    public static void main(String[] args) {

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(44);
        arrayQueue.enqueue(122);
        arrayQueue.enqueue(-4);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(0);
        arrayQueue.enqueue(99);

        System.out.println("Unsorted array: " + arrayQueue);
        sortQueue(arrayQueue);
        System.out.println("Sorted array: " + arrayQueue);
    }

    public static void sortQueue(ArrayQueue<Integer> queue) {
        // Create auxiliary queue space
        ArrayQueue<Integer> auxQueue = new ArrayQueue<>();
        int current;
        int min;

        // Repeat until queue has no items
        while (!queue.isEmpty()) {
            min = Integer.MAX_VALUE;
            // Find minimum value by repeatedly dequeueing front and enqueueing to back
            for (int i = 0; i < queue.size(); i++) {
                current = queue.dequeue();
                min = Math.min(current, min);
                queue.enqueue(current);
            }
            // Loop through main queue again by dequeueing front
            for (int i = 0; i < queue.size(); i++) {
                current = queue.dequeue();
                // If dequeued item is minimum, enqueue to auxiliary
                // else enqueue back to main queue
                if (current == min) {
                    auxQueue.enqueue(current);
                } else {
                    queue.enqueue(current);
                }
                // Next iteration, main queue will not contain minimum value
            }
        }

        // Add auxiliary elements back to original queue
        while (!auxQueue.isEmpty()) {
            queue.enqueue(auxQueue.dequeue());
        }
    }

}
