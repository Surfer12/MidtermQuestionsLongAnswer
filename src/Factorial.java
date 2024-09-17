import java.util.Iterator;
// use only for loop

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public int calculateFactorial(int factorial) {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(5);
        System.out.println("Factorial of " + factorial.getNumber() + " is " + factorial.calculateFactorial(1));
    }
}
