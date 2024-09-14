Here are the basic methods for implementing a Queue and a Stack in Java:

### Stack Methods
A Stack follows the Last In First Out (LIFO) principle. Here are common methods:
# A Stack is a Last In First Out (LIFO) data structure.

```java
public class Stack<T> {
    private List<T> elements = new ArrayList<>();

    // Push an element onto the stack
    public void push(T item) {
        elements.add(item);
    }

    // Pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    // Peek at the top element of the stack
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return elements.size();
    }
}
```

### Queue Methods
A Queue follows the First In First Out (FIFO) principle. Here are common methods:

# A Queue is a First In First Out (FIFO) data structure.

```java
public class Queue<T> {
    private List<T> elements = new LinkedList<>();

    // Enqueue an element to the queue
    public void enqueue(T item) {
        elements.add(item);
    }

    // Dequeue an element from the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elements.remove(0);
    }

    // Peek at the front element of the queue
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elements.get(0);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return elements.size();
    }
}
```

### Explanation
- **Stack**: Implements `push`, `pop`, `peek`, `isEmpty`, and `size` methods.
- **Queue**: Implements `enqueue`, `dequeue`, `peek`, `isEmpty`, and `size` methods.
- Both use a list to store elements, with the Stack using `ArrayList` and the Queue using `LinkedList` for efficient removal from the front.