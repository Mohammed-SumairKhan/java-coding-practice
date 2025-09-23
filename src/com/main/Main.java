package com.main;

import java.util.Scanner;

import com.programs.Palindrome;
import com.programs.ReverseString;
import com.programs.Vowels;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();

		Vowels.countVowels(input);
		
		scan.close();
	}
	
}
