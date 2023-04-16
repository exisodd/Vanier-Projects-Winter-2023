package assignment2;

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

        System.out.println("Unsorted array: " + arrayQueue);
    }

    public static void sortQueue(ArrayQueue<Integer> queue) {
        //
        ArrayQueue<Integer> auxQueue = new ArrayQueue<>();
        int current = queue.dequeue();
        auxQueue.enqueue(current);

        while (!queue.isEmpty()) {
            current = queue.dequeue();
            while (!auxQueue.isEmpty() && auxQueue.first() < current) {
                queue.enqueue(auxQueue.dequeue());
            }
        }
    }

}
