package assignment2;

public class ArrayQueue<T> implements QueueADT<T> {
    private final int DEFAULT_CAPACITY = 100;
    private int count;
    private T[] queue;

    public ArrayQueue() {
        queue = (T[]) new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    public ArrayQueue(int capacity) {
        queue = (T[]) new Object[capacity];
        count = 0;
    }

    @Override
    // Add element to end of the queue
    public void enqueue(T element) {
        // If queue is full, resize array
        if (size() == queue.length)
            expandCapacity();
        queue[count++] = element;
    }

    @Override
    // Removes the element at the front of the queue and returns reference to it
    public T dequeue() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        // Get front element
        T result = queue[0];

        // Shift elements left
        for (int i = 0; i < count; i++) {
            queue[i] = queue[i + 1];
        }
        queue[--count] = null;

        return result;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue[0];
    }

    // Helper method double array when full
    private void expandCapacity() {
        T[] newQueue = (T[]) new Object[size() * 2];
        System.arraycopy(queue, 0, newQueue, 0, size());
        queue = newQueue;
    }
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < size(); i++) {
            s.append(queue[i]);
            if (i < size() - 1) {
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }
}

