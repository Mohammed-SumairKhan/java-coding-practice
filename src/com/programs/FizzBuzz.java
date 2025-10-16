package com.programs;

public class FizzBuzz {
	public static void getFizzBuzz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print("Fizzbuzz" + " ");
			} else if(i%3 == 0) {
				System.out.print("Fizz" + " ");
			} else if(i%5 == 0) {
				System.out.print("Bizz" + " ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
