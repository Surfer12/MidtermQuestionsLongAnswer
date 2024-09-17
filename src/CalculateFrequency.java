/* Write a program that takes a word as input and calculates the frequency of each letter in that word. The output should clearly display each letter and its corresponding frequency in the input word. Choose an appropriate way to represent and present this frequency information.

For the input word 'banana', the output could be something like:

b: 1
a: 3
n: 2 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to count the frequency of each letter: ");
        String word = scanner.nextLine().toLowerCase();
        scanner.close();

        Map<Character, Integer> frequencyMap = new HashMap<>(); // create a hash map to store the frequency of each
                                                                // character

        for (char c : word.toCharArray()) { // creates a char array of the word
            if (Character.isLetter(c)) { // if it's a letter
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1); // retrieves the current value of element c
                // if it's not there, it's 0, then adds 1 to the value to increment the count
                // put the character and the frequency into the frequency map
            }
        }

        // Display the frequency of each letter
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print the key and value of the frequency
                                                                          // map
        }
    }
}
