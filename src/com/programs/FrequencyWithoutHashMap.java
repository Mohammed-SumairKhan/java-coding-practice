package com.programs;

/**
 * This class provides a method to calculate the frequency of each element
 * in an integer array without using a HashMap.
 */
public class FrequencyWithoutHashMap {

    public static void main(String[] args) {
        int[] ar = {1, 2, 2, 2, 3, 3, 3, 1};  // Input array
        printFrequency(ar);                  // Call method to print frequency
    }

    /**
     * This method prints the frequency of each element in the array.
     * It uses a boolean array to keep track of elements already counted.
     *
     * @param ar The integer array to process
     */
    static void printFrequency(int[] ar) {
        boolean[] counted = new boolean[ar.length];  // Keeps track of counted elements

        // Traverse the array
        for (int i = 0; i < ar.length; i++) {

            // Skip this element if it has already been counted
            if (counted[i]) continue;

            int count = 1;  // Initialize count for current element

            // Compare current element with remaining elements
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;          // Increment count for matching element
                    counted[j] = true; // Mark this element as counted
                }
            }

            // Print element and its frequency
            System.out.println(ar[i] + " - " + count);
        }
    }
}
