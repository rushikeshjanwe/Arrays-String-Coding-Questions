package com.example;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateNo {
	
	  public static int findDuplicate(int[] nums) {
	        
//		  HashMap<Integer, Integer> map = new HashMap<>();
//		  
//		  for(int i=0;i<nums.length;i++) {
//			  if(map.containsKey(nums[i])) {
//				  return nums[i];
//			  }
//			  map.put(nums[i], 1);
//		  }
//		  
//		  return -1;
//	    }
		  
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return nums[i];
			}
			set.add(nums[i]);
		}
		 
	return -1;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicate(new int[] {3,1,4,2,3});
	}



}
