package com.example;

import java.util.Arrays;

public class RotateArrayByK {

	
	public static void rotateclockwise(int[] arr, int k) {
       
		int n=arr.length;
		k=k%n;
		
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
        
	}
	
	 static void reverse(int[] arr,int start, int end) {
		
		 while(start<end) {
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		 }
		 System.out.print(Arrays.toString(arr));
    }
	
	
	public static void main(String[] args) {

	    int[] arr = {1,2,3,4,5,6,7};

	    rotateclockwise(arr, 3);

	    for(int num : arr){
	        System.out.print(num + " ");
	    }
	}}