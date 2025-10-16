package com.programs;

import java.util.Scanner;

public class MissingElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int[] ar= new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		n = n+1;
		int sum1 = n*(n+1)/2;
		int sum2 = 0;
		for (int i = 0; i < ar.length; i++) {
			sum2 = sum2+ar[i];
		}
		int missingElement = sum1 - sum2;
		System.out.println("Missing Element is: " + missingElement);
	}
}
