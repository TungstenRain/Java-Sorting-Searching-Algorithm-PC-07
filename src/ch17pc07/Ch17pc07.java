package ch17pc07;

import java.util.Random;
import java.util.Scanner;
import static ch17pc07.IntBinarySearcher.*;
import static ch17pc07.IntSequentialSearcher.*;

/**
 * 
 * @author frank
 */
public class Ch17pc07 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Array of 20 integers
        // Sequential search to locate one of the values
        // method keep a count # of comparisons
        // Binary search to locate the same number
        // Count the number of comparisons it makes
        // Display these numbers
        
        // Variables
        int[] randomArray = new int[20];
        int randomNumber = 0;
        int binaryCount = 0;
        int sequentialCount = 0;
        
        // Instantiate Random Class
        Random rand = new Random();
        
        // Instantiate Scanner Object
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to the Binary and Sequential Search comparer.");
        System.out.println("Generating array of integers.");
        // Populate the array and display to user
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = rand.nextInt(10000);
            System.out.print(randomArray[i] + " ");
        }
        
        // Populate the randomNumber with a random number from the array
        randomNumber = randomArray[rand.nextInt(20)];
        System.out.println(System.getProperty("line.separator") + "Random number from the array: " + randomNumber);
        
        // Perform search and return count
        System.out.println("Performing binary search...");
        binaryCount = binarySearchCounter(randomArray, randomNumber);
        System.out.println("Performing sequential search...");
        sequentialCount = sequentialSearchCounter(randomArray, randomNumber);
        
        // Report results
        System.out.println("The number of comparisons for the Binary Search method: " + binaryCount);
        System.out.println("The number of comparisons for the Sequential Search method: " + sequentialCount);
    }

}
