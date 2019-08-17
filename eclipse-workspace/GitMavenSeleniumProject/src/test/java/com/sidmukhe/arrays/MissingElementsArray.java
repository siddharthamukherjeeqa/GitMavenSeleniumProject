package com.sidmukhe.arrays;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class MissingElementsArray {

	
	@Test
	public void test() {
		int [] arr = {2, 4, 10, 7}; 
		missingElementsinArray(arr, 3);
		copyArray();
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        compareArrays(arr1, arr2);
        int arra[] = new int[2];   
        System.out.println(arra[0]); 
        System.out.println(arra[1]); 
	}
	public void compareArrays(int[] array1, int[] array2) {
		Object [] a1 = {array1};
		Object [] a2 = {array2};
		if(Arrays.deepEquals(a1, a2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	public void missingElementsinArray(int[] array, int k) {
		Arrays.sort(array);
		int len = array[array.length - 1];
		
		HashSet<Integer> newArray = new HashSet<>();
		for (int i = array[0]; i <= len; i++) {
			newArray.add(i);
		}
		System.out.println(newArray);
		
		for(int i = 0; i < array.length; i++) {
			if(newArray.contains(array[i])) {
				newArray.remove(array[i]);
			}
		}
		System.out.println(newArray);
		Object [] arr = newArray.toArray();
		System.out.println(arr[k]);
	}
	
	public void copyArray() {
		int [] array = {1,2,3,4};
		int [] clonearray = array.clone();
		System.out.println(clonearray.length);
	}
}
