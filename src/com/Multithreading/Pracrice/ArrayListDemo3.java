package com.Multithreading.Pracrice;

//	3.	Program for design the generic arraylist for String type only

import java.util.ArrayList;
public class ArrayListDemo3 {

public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		
	// since it is defined as....."10"....it will be treated as String	
		
		al.add("10");                               
		al.add("rushikesh");
		al.add("30");
		
		for(String str: al) {
			System.out.println(""+str);
		}
	}
}
