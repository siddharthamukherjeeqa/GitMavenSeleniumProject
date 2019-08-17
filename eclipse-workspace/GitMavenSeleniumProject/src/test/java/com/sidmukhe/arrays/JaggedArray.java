package com.sidmukhe.arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class JaggedArray {

	final static int x = 0;
	@Test
	public void test() {
		
	}
	@Test
	public void jaggedArray() {
		int [][] arr = new int[2][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		int count = 0;
		
		for (int i=0; i<arr.length; i++) 
            for(int j=0; j<arr[i].length; j++) 
                arr[i][j] = count++; 
  
        // Displaying the values of 2D Jagged array 
        System.out.println("Contents of 2D Jagged Array"); 
        for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
	}
}
