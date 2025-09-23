package com.programs;

public class Palindrome {
	//Check if a String is a Palindrome
	
	public static void checkPalindrome1(String s) {
		String t = "";
		for(int i=s.length() - 1; i>=0 ; i--) {
			t += s.charAt(i);
		}
		if(s.equals(t)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void checkPalindrome2(String s) {
		String reverse = new StringBuilder(s).reverse().toString();
		if(reverse.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
