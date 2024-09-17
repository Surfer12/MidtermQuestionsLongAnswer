import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class calculates the factorial of a given number using a custom iterator.
 * It demonstrates the use of an iterator to perform a calculation that involves
 * iterating over a sequence of numbers.
 */
public class FactorialWithIterator {
    private int number;

    /**
     * Constructor to initialize the number for which the factorial is to be calculated.
     * 
     * @param number The number for which the factorial is to be calculated.
     */
    public FactorialWithIterator(int number) {
        this.number = number;
    }

    /**
     * Getter method to retrieve the number.
     * 
     * @return The number for which the factorial is to be calculated.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter method to set the number.
     * 
     * @param number The new number for which the factorial is to be calculated.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Custom iterator for factorial calculation. This iterator generates a sequence
     * of numbers from 1 to the number set in the class, which is then used to calculate
     * the factorial.
     */
    private class FactorialIterator implements Iterator<Integer> {
        private int current = 1;

        /**
         * Checks if there are more numbers in the sequence.
         * 
         * @return true if there are more numbers, false otherwise.
         */
        @Override
        public boolean hasNext() {
            return current <= number;
        }

        /**
         * Returns the next number in the sequence. If there are no more numbers,
         * it throws a NoSuchElementException.
         * 
         * @return The next number in the sequence.
         * @throws NoSuchElementException If there are no more numbers.
         */
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return current++;
        }
    }

    /**
     * Calculates the factorial of the number using the custom iterator.
     * 
     * @return The factorial of the number.
     */
    public int calculateFactorial() {
        int factorial = 1;
        Iterator<Integer> iterator = new FactorialIterator();
        while (iterator.hasNext()) {
            factorial *= iterator.next();
        }
        return factorial;
    }

    /**
     * Main method to test the FactorialWithIterator class.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        FactorialWithIterator factorial = new FactorialWithIterator(5);
        System.out.println("Factorial of " + factorial.getNumber() + " is " + factorial.calculateFactorial());
    }
}