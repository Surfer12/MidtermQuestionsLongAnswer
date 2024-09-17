import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class QueueReverserTest {

   @Test
   public void testReverseQueueWithMultipleElements() {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(1);
      queue.add(2);
      queue.add(3);
      Stack<Integer> stack = new Stack<>();

      QueueReverser.reverseQueue(queue, stack);

      assertEquals(3, queue.remove());
      assertEquals(2, queue.remove());
      assertEquals(1, queue.remove());
   }

   @Test
   public void testReverseQueueWithSingleElement() {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(1);
      Stack<Integer> stack = new Stack<>();

      QueueReverser.reverseQueue(queue, stack);

      assertEquals(1, queue.remove());
   }

   @Test
   public void testReverseQueueWithEmptyQueue() {
      Queue<Integer> queue = new LinkedList<>();
      Stack<Integer> stack = new Stack<>();

      QueueReverser.reverseQueue(queue, stack);

      assertTrue(queue.isEmpty());
   }

   @Test
   public void testReverseQueueWithDuplicateElements() {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(1);
      queue.add(2);
      queue.add(2);
      queue.add(1);
      Stack<Integer> stack = new Stack<>();

      QueueReverser.reverseQueue(queue, stack);

      assertEquals(1, queue.remove());
      assertEquals(2, queue.remove());
      assertEquals(2, queue.remove());
      assertEquals(1, queue.remove());
   }
}