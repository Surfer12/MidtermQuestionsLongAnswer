import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DequeQueImplimentationTest {

   private Queue<Integer> queue;
   private Deque<Integer> stack;

   @BeforeEach
   public void setUp() {
      queue = new LinkedList<>();
      stack = new ArrayDeque<>();
   }

   @Test
   public void testReverseQueue() {
      queue.add(1);
      queue.add(2);
      queue.add(3);

      DequeQueImplimentation.reverseQueue(queue, stack);

      assertEquals(3, queue.remove());
      assertEquals(2, queue.remove());
      assertEquals(1, queue.remove());
   }

   @Test
   public void testPrintQueue() {
      queue.add(1);
      queue.add(2);
      queue.add(3);

      // Capture the output of printQueue method
      java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
      System.setOut(new java.io.PrintStream(outContent));

      DequeQueImplimentation.printQueue(queue);

      String expectedOutput = "1\n2\n3\n";
      assertEquals(expectedOutput, outContent.toString());
   }
}