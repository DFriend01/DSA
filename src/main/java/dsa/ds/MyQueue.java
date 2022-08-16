package dsa.ds;

import java.util.LinkedList;

/**
 * My implementation of a queue using a linked list.
 */
public class MyQueue<T> {

    private LinkedList<T> queue;

    /**
     * Initialize an instance of MyQueue.
     */
    public MyQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Put an element at the back of the queue.
     * @param element The element to be added to the queue.
     */
    public void enqueue(T element) {
        queue.addLast(element);
    }

    /**
     * Removes an element from the front of the queue.
     * @return Returns the removed element.
     */
    public T dequeue() {
        return queue.removeFirst();
    }

    /**
     * Gets the element at the front of the queue.
     * @return The element at the front of the queue.
     */
    public T peek() {
        return queue.getFirst();
    }

    /**
     * Gets the number of elements currently in the queue.
     * @return Returns the number of elements.
     */
    public int size() {
        return queue.size();
    }

    /**
     * Determines if the queue is empty.
     * @return Returns true if the queue is empty and false otherwise.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
