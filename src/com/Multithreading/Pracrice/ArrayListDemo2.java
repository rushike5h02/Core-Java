package com.Multithreading.Pracrice;

//	Program for design generic arraylist for Integer type only

import java.util.ArrayList;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		
// we can use ...for each loop... instead of Iterator
		
		for(int i: al) {
			System.out.println(""+i);
		}
	}
}
