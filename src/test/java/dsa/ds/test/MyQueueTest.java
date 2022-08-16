package dsa.ds.test;

import dsa.ds.MyQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void testEnqueue() {
        MyQueue<Integer> queue = new MyQueue<>();

        // Check that it is empty
        assertEquals(queue.size(), 0);

        // Queue a few items
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);

        // Check the size
        assertEquals(queue.size(), 3);
        assertEquals(queue.peek(), Integer.valueOf(0));
    }

    @Test
    public void testIsEmpty() {
        MyQueue<Integer> queue = new MyQueue<>();

        // Assert that the queue is empty
        assertTrue(queue.isEmpty());

        // Enqueue a few elements
        queue.enqueue(0);
        queue.enqueue(1);

        // Assert that the queue is non-empty
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() {
        MyQueue<Integer> queue = new MyQueue<>();

        // Check that the queue is empty initially
        assertTrue(queue.isEmpty());

        // Enqueue a few elements
        for(int i = 0; i < 10; i++) {
            queue.enqueue(i);
            assertFalse(queue.isEmpty());
            assertEquals(queue.peek(), Integer.valueOf(0));
        }

        // Dequeue everything until empty
        for(int i = 0; i < 10; i++) {
            assertEquals(Integer.valueOf(i), queue.peek());
            assertEquals(Integer.valueOf(i), queue.dequeue());
            assertEquals(10 - (i+1), queue.size());
        }

        // Assert that the queue is empty
        assertTrue(queue.isEmpty());
    }
}
