package dsa.ds.test;

import dsa.ds.MyStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();

        // Stack is empty
        assertEquals(stack.size(), 0);

        // Push a few elements
        stack.push(0);
        stack.push(1);
        stack.push(2);

        // Check the top of the stack
        assertEquals(stack.peek(), Integer.valueOf(2));
        assertEquals(stack.size(), 3);
    }

    @Test
    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();

        // Check that the stack is empty
        assertTrue(stack.isEmpty());

        // Push an item
        stack.push(0);

        // Check that the stack is non-empty
        assertFalse(stack.isEmpty());

    }

    @Test
    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();

        // Check that stack is empty
        assertTrue(stack.isEmpty());

        // Push a few elements
        for(int i = 0; i <= 9; i++) {
            stack.push(i);
            assertEquals(stack.peek(), Integer.valueOf(i));
            assertEquals(stack.size(), i+1);
        }

        // Pop until empty
        for(int i = 9; i >= 0; i--) {
            assertEquals(stack.size(), i+1);
            assertEquals(stack.pop(), Integer.valueOf(i));
        }

        // Check that the stack is empty again
        assertTrue(stack.isEmpty());

    }

}
