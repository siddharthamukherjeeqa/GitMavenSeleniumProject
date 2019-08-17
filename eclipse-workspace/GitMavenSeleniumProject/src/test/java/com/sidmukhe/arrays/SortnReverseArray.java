package com.sidmukhe.arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortnReverseArray {
	
	@Test
	public void test() {
		System.out.println("Array Sort");
		int[] array = {1,10,4,11,12,3,2};
		this.arraySort(array);
		System.out.println("Array Reverse");
		this.arrayReverse(array);
	}
	
	public void arraySort(int [] array) {
		Arrays.sort(array);
		for(int i =0; i < array.length; i ++) {
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
	
	public void arrayReverse(int [] array) {
		Arrays.sort(array);
		for(int i = array.length -1; i >= 0 ; i --) {
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
}
