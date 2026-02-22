package com.example;

import java.util.stream.Stream;

public class isPalindrome {

	
	 public static boolean isPalindrome(String s) {
		
		s=s.toLowerCase().replaceAll("[^a-z0-9]","");
		
		int start=0;
		int end=s.length()-1;
		
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		System.out.println(s);
	    return true;
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			isPalindrome("A man, a plan, a canal: Panama");
	}

}
