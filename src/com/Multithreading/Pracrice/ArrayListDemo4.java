package com.Multithreading.Pracrice;

//	4. Program for demonstrate the arraylist method

import java.util.ArrayList;
public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(2,75);              //...here...2..is Index Position....75...is Element
		System.out.println("size of list is="+al.size());
		System.out.println("List="+al);
		System.out.println(al.contains(80));
	}
}
