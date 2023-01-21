package com.Multithreading.Pracrice;

//. Program for sorting arraylist

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("shubham");
		al.add("rahul");
		al.add("laxman");
		al.add("snehal");
		al.add("kshitija");
		al.add("yogesh");
		al.add("piyush");
		al.add("pushkar");
		al.add("ajay");
		
		Collections.sort(al);  // to sort Alphabetically
		
		System.out.println(al);
	}
}

