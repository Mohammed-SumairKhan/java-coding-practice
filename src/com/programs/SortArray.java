package com.programs;

/**
 *  sort the elements in the array based on condition
 *  ar[j] < ar[minIndex] - sort in ascending order
 *  ar[j] > ar[minIndex] - sort in descending order
 */
public class SortArray {
	public static void main(String[] args) {
		int[] ar = {3 , 5 , 2 , 4 , 1};
		
		for(int i=0;i<ar.length;i++) {
			int minIndex = i;
			
			for(int j=i+1; j<ar.length;j++) {
				if(ar[j] < ar[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = ar[i];
			ar[i] = ar[minIndex];
			ar[minIndex] = temp;
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " "); // prints the output after sorting 
		}
	}
}
