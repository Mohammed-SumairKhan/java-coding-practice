package com.programs;

public class SubString {
	public static void getAllSubString(String str) {
		for(int size=1;size<=str.length();size++) {
			for(int i=0; i<=str.length()-size;i++) {
				String t = "";
				for(int j=i;j<i+size;j++) {
					t = t+str.charAt(j);
				}
				System.out.println(t);
			}
		}
	}
	
	public static void getLargestSubString(String str) {
		for(int size=str.length();size>=1;size--) {
			for(int i=0;i<=str.length()-size;i++) {
				String t = "";
				for(int j=i;j<i+size;j++) {
					t = t + str.charAt(j);
				}
				System.out.println(t);
			}
		}
	}
}
