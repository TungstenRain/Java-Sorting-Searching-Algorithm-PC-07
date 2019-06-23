/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17pc07;

/**
 *
 * @author 4400095471
 */
public class IntSequentialSearcher {
    
    public static int sequentialSearchCounter(int[] array, int value) {
        int index = 0;
        boolean found = false;
        int counter = 0;
        
        while (!found && index < array.length) {
            counter++;
            if (array[index] == value) {
                found = true;
            } else {
                index++;
            }
        }
        return counter;
    }
}
