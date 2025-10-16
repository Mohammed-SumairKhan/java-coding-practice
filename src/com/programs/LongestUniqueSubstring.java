package com.programs;

import java.util.Scanner;
/**
 * it is used to find largest substring with out repeating characters
 * and the length of the String 
 */
public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        sc.close();

        String longest = "";
        int maxLength = 0;
        int n = s.length();
        
        for(int i=0;i<n;i++) {
        	boolean[] seen = new boolean[256];
        	
        	String current = "";
        	for(int j=i;j<n;j++) {
        		char ch = s.charAt(j);
        		if(seen[ch]) {
        			break;
        		}
        		seen[ch] = true;
        		current += ch;
        		if(current.length() > maxLength) {
        			maxLength = current.length();
        			longest = current;
        		}
        	}
        	
        }
        System.out.println("longest subString: "+ longest);
        System.out.println("longest size: "+ maxLength);
    }
}

