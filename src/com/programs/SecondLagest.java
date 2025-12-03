package com.programs;

/**
 * This class provides a method to find the second largest element 
 * in a given integer array.
 */
public class SecondLagest {

    public static void main(String[] args) {
        int[] ar = {10, 20, 4, 45, 99};  // Array of integers
        secondLargest(ar);               // Calling the method to find second largest
    }

    /**
     * This method finds and prints the second largest number in the array.
     *
     * @param ar The integer array to check
     */
    static void secondLargest(int[] ar) {
        int firstLargest = ar[0];               // Variable to store the largest number
        int secondLargest = Integer.MIN_VALUE;  // Variable to store the second largest number, initialized to minimum integer value

        // Traverse the array starting from index 1
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > firstLargest) {
            	
                // If current element is greater than firstLargest,
                // update secondLargest to previous firstLargest
            	
                secondLargest = firstLargest;
                firstLargest = ar[i];  // Update firstLargest
                
            } else if (ar[i] > secondLargest && ar[i] != firstLargest) {
                // If current element is greater than secondLargest
                // and not equal to firstLargest, update secondLargest
                secondLargest = ar[i];
            }
        }

        // Print the second largest element
        System.out.println(secondLargest);
    }
}
