package com.Multithreading.Pracrice;

//  1.	Program for copy one arraylist into another arraylist

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10); // 0th index
		al.add(20); // 1st index
		al.add(30); // 2nd index

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(40); // 0th index
		al2.add(50); // 1st index
		al2.add(60); // 2nd index

// to print as..... ArrayList....		
		al.addAll(al2);
		System.out.println("copy arraylist is=" + al);

// to print .....generic Arraylist.......    <Integer>...is <object>....is generic way to get element		
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			

			
		}
	}
}

