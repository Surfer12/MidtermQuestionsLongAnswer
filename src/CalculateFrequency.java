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

        Map<Character, Integer> frequencyMap = new HashMap<>(); // create a hash map to store the frequency of each character

        
        for (char c : word.toCharArray()) { // creates a char array of the word
            if (Character.isLetter(c)) { // if it's a letter 
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1); // add it to the frequency map or assign it a default value of 0 or add 1 if it's already there
            }
        }

        // Display the frequency of each letter
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
