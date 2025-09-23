package com.programs;

public class ReverseString {
	// There are two ways to reverse a string 
	
	/**
	 * this method reverse without using a reverse() method
	 * @param s
	 */
	public static void reverseWithoutBuildInFuction(String s) {
		String t = "";
		for(int i=s.length() - 1; i>=0; i--) {
			t += s.charAt(i);
		}
		System.out.println(t);
	}
	
	/**
	 * this method reverse with using a reverse() method
	 * @param s
	 */
	public static void reverseWithBuildInFuction(String s) {
		String reverse = new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
	}
	
}
