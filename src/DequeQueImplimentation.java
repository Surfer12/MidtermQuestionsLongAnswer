import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * This class represents an implementation of a queue using a deque and stack.
 * It provides methods to reverse the elements in the queue and print the queue.
 */
public class DequeQueImplimentation {

    private Queue<Integer> queue;
    private Deque<Integer> stack;

    public DequeQueImplimentation(Queue<Integer> queue, Deque<Integer> stack) {
        this.queue = queue; // initialize the queue
        this.stack = stack; // initialize the stack
    }

    public static void reverseQueue(Queue<Integer> queue, Deque<Integer> stack) {
        // Push all elements from the queue to the stack
        pushToStack(queue, stack); // call the pushToStack method
        // Pop all elements from the stack back to the queue
        popFromStackToQueue(queue, stack); // call the popFromStackToQueue method
    }

    public static void pushToStack(Queue<Integer> queue, Deque<Integer> stack) {
        // Transfer all elements from the queue to the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }

    public static void popFromStackToQueue(Queue<Integer> queue, Deque<Integer> stack) {
        // Transfer all elements from the stack back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void printQueue(Queue<Integer> queue) {
        for (Integer integer : queue) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        Deque<Integer> stack = new ArrayDeque<>();
        reverseQueue(queue, stack);
        printQueue(queue);
    }
}