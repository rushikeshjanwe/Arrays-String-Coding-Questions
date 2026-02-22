package com.example;

import java.util.Arrays;

public class Practice {
	
	public static int getSecondLargest(int[] arr) {
		
	int second=Integer.MIN_VALUE;
	int biggest=arr[0];
	
	for(int i=1;i<arr.length;i++) {
		
		if(arr[i]>biggest) {
			second=biggest;
			biggest=arr[i];
		}
		
		else if(arr[i]>second && arr[i]!=biggest) {
			second=arr[i];
		}
	}
	
	if(second==Integer.MIN_VALUE) {
		return -1;
	}

	System.out.println(Arrays.toString(arr));
	System.out.println("Second largest: "+second);
	return second;	
	}
	public static void main(String[] args) {
	
		getSecondLargest(new int[] {12, 35, 1, 10, 34, 1});
		
	}
}
