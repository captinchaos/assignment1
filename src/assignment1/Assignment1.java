/******************************************************************************
* assignment1.java
* Charles Stevens
* 
* This is a simple class that asks the user to input 10 numbers, it then outputs
* those numbers, and finally it outputs those numbers in reverse order.
******************************************************************************/
package assignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Captinchaos
 */

public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int arrayLength = 10;                   // Master length of arrays used
        int[] array1 = new int[arrayLength];    // Master array
        int[] array2 = new int[arrayLength];    // Reversed array
        String outputArray1 = "";               // Output string of array1
        String outputArray2 = "";               // Output string of array2
        Scanner scan = new Scanner(System.in);  // Scanner input assignment
        
        // Asks the user to input 10 numbers and assigns those numbers to array1
        System.out.println("Enter 10 numbers, seperated by spaces or linefeeds");
        for (int i = 0; i < array1.length; i++) 
        {
            array1[i] = scan.nextInt();
        }
        
        // Copies array1 to array2 and then reverses array2.
        array2 = Arrays.copyOf(array1, array1.length);
        for (int i = 0; i < array2.length/2; i++) 
        {
            int temp = array2[i];
            array2[i] = array2[array2.length - i - 1];
            array2[array2.length - i - 1] = temp;
        }
        
        // Converts the arrays to a string and removes the brackets.
        outputArray1 = java.util.Arrays.toString(array1);
        outputArray1 = outputArray1.replaceAll("[\\[\\]]","");
        outputArray2 = java.util.Arrays.toString(array2);
        outputArray2 = outputArray2.replaceAll("[\\[\\]]","");
        
        // Outputs the information to the console.
        System.out.println("\nThe first array contains:\n" + outputArray1);
        System.out.println("\nThe second array contains:\n" + outputArray2);
        System.out.println("\nJob Done!");

    }
}
