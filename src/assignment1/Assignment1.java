/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public static void main(String[] args) {
        
        int arrayLength = 10;
        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];
        String outputArray1 = "";
        String outputArray2 = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 number");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan.nextInt();
        }
        array2 = Arrays.copyOf(array1, array1.length);
        for (int i = 0; i < array2.length/2; i++) {
            int temp = array2[i];
            array2[i] = array2[array2.length - i - 1];
            array2[array2.length - i - 1] = temp;
        }

        outputArray1 = java.util.Arrays.toString(array1);
        outputArray1 = outputArray1.replaceAll("[\\[\\]]","");
        outputArray2 = java.util.Arrays.toString(array2);
        outputArray2 = outputArray2.replaceAll("[\\[\\]]","");
        
        System.out.println("\nThe first array contains:\n" + outputArray1);
        System.out.println("\nThe second array contains:\n" + outputArray2);
        System.out.println("\nJob Done!");

    }
}
