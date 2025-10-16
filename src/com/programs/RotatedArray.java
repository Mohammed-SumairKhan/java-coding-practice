package com.programs;

import java.util.Scanner;

public class RotatedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		System.out.println("Enter the k value: ");
		int k = scan.nextInt();

		int[] rotated = new int[n];
		for (int i = 0; i < n; i++) {

			rotated[(i + k)] = ar[i];

		}
		for (int arr : rotated) {
			System.out.print(arr + " ");
		}
	}
}
