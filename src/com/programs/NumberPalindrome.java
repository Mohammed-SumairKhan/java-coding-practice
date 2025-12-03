package com.programs;

/**
 * This class provides a method to check whether 
 * a given number is a palindrome or not.
 */
public class NumberPalindrome {
	
	public static void main(String[] args) {
		checkPalindrome(151);   // Calling the palindrome checking method
	}

	/**
	 * This method checks if the given integer is a palindrome.
	 * A number is a palindrome if it reads the same forward and backward.
	 *
	 * @param n The number to be checked
	 */
	static void checkPalindrome(int n) {

		// If number is negative, return immediately as negative numbers can't be palindrome
		if (n < 0) {
			System.out.println("not a palindrome");
			return;
		}

		int temp = n;  // Store original number to compare later
		int last = 0;  // To store the last digit of the number
		int rev = 0;   // To store the reversed number

		// Reverse the number
		while (n != 0) {
			last = n % 10;         // Extract last digit
			rev = rev * 10 + last; // Build reverse number
			n = n / 10;            // Remove last digit
		}

		// Compare reverse with original
		if (rev == temp) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
