package com.sidmukhe.arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LargestNumberfromArray {

	@Test
	public void test() {
		System.out.println("Array Sort");
		int[] array = {1,10,4,11,12,3,2};
		this.largestNumber(array);
		
	}
	
	public void largestNumber(int [] array) {
		Arrays.sort(array);		
		System.out.println(array[array.length - 1]);
	}
}
