package com.programs;

public class SplitString {
	/**
	 * this will split the String by "," and 
	 * print the String one by one 
	 * for ex: sumair,khan,mohammed
	 * o/p: sumair 
	 * khan
	 * mohammed
	 * @param str
	 */
	public static void split1(String str) {
		String[] s = str.split(",");
		for(String spiltedString : s) {
			System.out.println(spiltedString);
		}
	}
	
	/**
	 * this will split the String by ',' 
	 * without using Split() method
	 * @param str
	 */
	public static void split2(String str) {
		String modiedString = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ',') {
				modiedString += str.charAt(i);
			} else {
				System.out.println(modiedString);
				modiedString = "";
			}
		}
		System.out.println(modiedString);
	}
	
}













