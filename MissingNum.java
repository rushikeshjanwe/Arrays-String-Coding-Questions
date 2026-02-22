package com.example;

public class MissingNum {
	
	
	
	
	static int num(int[] arr) {
		
		int n=arr.length+1;
		
		int expectedSum=n*(n+1)/2;
		
		int acutalSum=0;
		for(int i=0;i<arr.length;i++) {
			acutalSum+=arr[i];
		}
		
		
		return expectedSum-acutalSum;
	}
	
	public static void main(String[] args) {
		
		num(new int[] {1,2,4,5});
		
	}

}
