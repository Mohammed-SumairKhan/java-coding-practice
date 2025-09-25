package com.programs;

import java.util.Scanner;

public class Replace {
	public static void replace(String str) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to replace: ");
		String oldStr = scan.nextLine();
		System.out.println("Enter the new String: ");
		String newStr = scan.nextLine();
		String result = str.replace(oldStr, newStr); 
		System.out.println("Modified String: " + result);
		scan.close();
	}
}
