/* Implement a Java method called reverseQueue that takes a Queue of integers as input and reverses the order of its elements. You can use any additional data structures you deem necessary. */

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

/**
 * The QueueReverser class provides a static method to reverse the order of
 * elements in a Queue.
 * It utilizes a Stack to achieve the reversal.
 */
public class QueueReverser {

    public static void reverseQueue(Queue<Integer> queue, Stack<Integer> stack) {
        pushToStack(queue, stack); // Pass the queue directly

        // pop all the elements from the stack to the queue to reverse the order
        popFromStackToQueue(queue, stack); // Add this line to reverse the queue
    }

    public static void pushToStack(Queue<Integer> queue, Stack<Integer> stack) { // Add type for parameters
        while (queueIsNotEmpty(queue)) {
            stack.push(queue.remove()); // Remove using queue and push to stack
        }
    }

    public static void popFromStackToQueue(Queue<Integer> queue, Stack<Integer> stack) { // Add type for parameters
        while (stackIsNotEmpty(stack)) {
            enqueue(queue, stack.pop()); // pop the element from the stack and enqueue it to the queue FIFO order
        }
    }

    public static boolean queueIsNotEmpty(Queue<Integer> queue) {
        return !queue.isEmpty();
    }

    public static boolean stackIsNotEmpty(Stack<Integer> stack) {
        return !stack.isEmpty();
    }

    public static void enqueue(Queue<Integer> queue, int element) {
        queue.add(element);
    }

    public static void dequeue(Queue<Integer> queue) {
        queue.remove();
    }

    public static void printQueue(Queue<Integer> queue) {
        for (int e : queue) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void printStack(Stack<Integer> stack) {
        for (int e : stack) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Use LinkedList as a concrete implementation of Queue
        queue.add(1); // Add elements to the queue for testing
        queue.add(2);
        queue.add(3);
        Stack<Integer> stack = new Stack<>();
        reverseQueue(queue, stack);
        printQueue(queue); // Print the reversed queue
    }
}