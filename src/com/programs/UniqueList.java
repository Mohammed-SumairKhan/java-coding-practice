package com.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueList {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input size of the list
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        ArrayList list = new ArrayList();
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            list.add(sc.nextInt());
	        }

	        sc.close();

	        // Remove duplicates while maintaining order
	        ArrayList uniqueList = new ArrayList();
	        for (Object num : list) {
	            if (!uniqueList.contains(num)) {
	                uniqueList.add(num);
	            }
	        }

	        // Print the result
	        System.out.println("List after removing duplicates: " + uniqueList);
	    }
}
