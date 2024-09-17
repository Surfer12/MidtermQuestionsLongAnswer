import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        // Test Queue methods
        System.out.println("Testing Queue methods:");
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        
        System.out.println("Queue after enqueuing: " + queue);
        
        // Dequeue and print elements
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Queue after dequeuing: " + queue);
        
        // Peek at the front element
        System.out.println("Front element (peek): " + queue.peek());
        
        // Check if queue is empty and get its size
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        
        System.out.println();

        // Test Stack methods
        System.out.println("Testing Stack methods:");
        Stack<Integer> stack = new Stack<>();
        
        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Stack after pushing: " + stack);
        
        // Pop and print elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping: " + stack);
        
        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek());
        
        // Check if stack is empty and get its size
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Stack size: " + stack.size());
    }
}