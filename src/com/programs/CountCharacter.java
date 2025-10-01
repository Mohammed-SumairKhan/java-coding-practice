package com.programs;

import java.util.Scanner;

public class CountCharacter {
	/**
	 * this will count the total number 
	 * 		of characters present in a String
	 * @param str
	 */
	public static void totalCountCharaters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		System.out.println("Number of Character present: " + count);
	}
	/**
	 * this will count how many times a specific character
	 * 		present inside a string 
	 * @param str
	 */
	public static void countCharacter(String str) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = scan.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Number of Character present: " + count);
		scan.close();
	}
	
}
