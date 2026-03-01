package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;





public class IntersectionTwoArrays{
 static ArrayList<Integer> intersect(int[] a, int[] b) {

	ArrayList<Integer> result = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i < a.length; i++) {
        set.add(a[i]);
    }
    System.out.println("Set after adding a: " + set);

    for(int i = 0; i < b.length; i++) {
        System.out.println("Checking b["+i+"] = " + b[i] + " → set = " + set);
        
        if(set.contains(b[i])) {
            result.add(b[i]);
            set.remove(b[i]);
            System.out.println("FOUND! result = " + result + " → set after remove = " + set);
        } else {
            System.out.println("NOT FOUND! skip");
        }
    }

    System.out.println("Final result = " + result);
    return result;
}

	public static void main(String[] args) {
		intersect(new int[] {1, 2, 1, 3, 1}, new int[] {3,1,3,4,1});
			}
}
