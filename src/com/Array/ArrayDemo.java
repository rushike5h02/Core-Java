package com.Array;

//...Array..is collection of similar/homogeneous data

// array size is fixed and Arrary Index starts from..0..

// array provides code optimization...as array is fasr compared to primitive data types
// array element storage is consecutive/linear

                                        // array element
// example...... array name    arr   10  20  30  40  50
  
                      //array size   0   1   2    3   4     // for array size=5

// written as arr[1]=10;      ....arrayName[array index] = value;


public class ArrayDemo {

	public static void main(String[] args) {
		
//		int arr[] = new int[5];          // declaration
//				
// 		arr[0] =10;      // initialization
//		arr[1] =20;
//		arr[2] =30;
//		arr[3] =40;
//		arr[4] =50;
		
		// initialization can be  ...declaration+initialization
		
	int arr[] = {10,20,30,40,50};	
		
		
		// for ..Traversing of array...to get element of array
		
		
		for(int i =0; i<arr.length; i++) {     // 0..array position,,,,arr.length..inbuilt method for lenght of array
			
		// we can also use...."for_each loop".....for Traversing
			
//			 for(int i : arr) {
		
			System.out.println(arr[i]);
		}
		
		
				
				
				
		
		

	}

}
