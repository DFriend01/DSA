package dsa.ds;

import java.util.LinkedList;

/**
 * My implementation of a stack using a linked list.
 */
public class MyStack<T> {

    private LinkedList<T> stack;

    /**
     * Initializes an instance of MyStack.
     */
    public MyStack() {
        stack = new LinkedList<>();
    }

    /**
     *
     * @param element The element to be pushed on to the stack.
     */
    public void push(T element) {
        stack.addLast(element);
    }

    /**
     *
     * @return Returns the element at the top of the stack without removing it.
     */
    public T peek() {
        return stack.getLast();
    }

    /**
     *
     * @return Returns the number of elements on the stack.
     */
    public int size() {
        return stack.size();
    }

    /**
     *
     * @return Returns true if the stack is empty and false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Removes an item from the stack.
     * @return Returns the removed item from the top of the stack.
     */
    public T pop() {
        return stack.removeLast();
    }

}
