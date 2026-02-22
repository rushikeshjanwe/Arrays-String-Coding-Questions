package com.example;

import java.util.Arrays;

public class ZerosToEnd {

	static void pushZerosToEnd(int[] arr) {
	     
	     int j=0;
	     
	     for(int i=0;i<arr.length;i++){
	         if(arr[i]!=0){
	            arr[j]=arr[i];
	            j++;
	         }
	     }
	     
	     for(int k=j;k<arr.length;k++) {
	    	 arr[k]=0;
	     }
	     
	  System.out.println(Arrays.toString(arr));
	     
	    
	}
	public static void main(String[] args) {
		
		pushZerosToEnd(new int[] {1,2,0,4,3,0,5,0});
	}
}
