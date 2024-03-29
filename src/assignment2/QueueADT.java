package assignment2;

public interface QueueADT<T> {
    // Interface provided by class notes

    //  Adds one element to the rear of the queue
    public void enqueue (T element);
    //  Removes and returns the element at the front of the queue
    public T dequeue( );
    //  Returns without removing the element at the front of the queue
    public T first( );
    //  Returns true if the queue contains no elements
    public boolean isEmpty( );
    //  Returns the number of elements in the queue
    public int size( );
    //  Returns a string representation of the queue
    public String toString( );
}

