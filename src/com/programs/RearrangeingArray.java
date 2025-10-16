package com.programs;

import java.util.Scanner;

public class RearrangeingArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		int i=0, j=0;
		while(i<ar.length) {
			if(ar[i] == 0) {
				i++;
			}else {
				ar[j] = ar[i];
				i++;
				j++;
			}
		}
			while(j<ar.length) {
				ar[j] = 0;
				j++;
			}
		
		for (int j2 = 0; j2 < ar.length; j2++) {
			System.out.print(ar[j2] + " ");
		}
		
		
	}
}
