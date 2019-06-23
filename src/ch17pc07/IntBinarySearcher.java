package ch17pc07;

/**
 * 
 * @author frank
 */
public class IntBinarySearcher {
    /**
     * 
     * @param array
     * @param value
     * @return 
     */
    public static int binarySearchCounter(int[] array, int value) {
        // Variables
        int first = 0;
        int last = array.length - 1;
        int middle;
        boolean found = false;
        int counter = 0;
        
        // Search for the value
        while (!found && first <= last) {
            counter++;
            middle = (first + last)/2;
            
            if(array[middle] == value) {
                found = true;
            } else if (array[middle] > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return counter;
    }
}
