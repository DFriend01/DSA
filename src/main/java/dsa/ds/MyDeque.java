package dsa.ds;

import java.util.LinkedList;

/**
 * My implementation of a deque using a linked list.
 */
public class MyDeque<T> {

    private LinkedList<T> deque;

    /**
     * Initializes an instance of MyDeque.
     */
    public MyDeque() {
        deque = new LinkedList<>();
    }

    /**
     * Adds an element on the left of the deque.
     * @param element The element to be added.
     */
    public void pushLeft(T element) {
        deque.addFirst(element);
    }

    /**
     * Adds an element on the right of the deque.
     * @param element The element to be added.
     */
    public void pushRight(T element) {
        deque.addLast(element);
    }

    /**
     * Removes an element from the left of the deque.
     * @return Returns the removed element.
     */
    public T popLeft() {
        return deque.removeFirst();
    }

    /**
     * Removes an element from the right of the deque.
     * @return Returns the removed element.
     */
    public T popRight() {
        return deque.removeLast();
    }

    /**
     * Gets the element on the left of the deque without removing it.
     * @return The element on the left of the deque.
     */
    public T peekLeft() {
        return deque.getFirst();
    }

    /**
     * Gets the element on the right of the deque without removing it.
     * @return The element on the right of the deque.
     */
    public T peekRight() {
        return deque.getLast();
    }

    /**
     * Gets the number of elements currently stored in the deque.
     * @return The number of elements in the deque.
     */
    public int size() {
        return deque.size();
    }

    /**
     * Determines if the deque is empty.
     * @return Returns true if the deque is empty and false otherwise.
     */
    public boolean isEmpty() {
        return deque.isEmpty();
    }

}
