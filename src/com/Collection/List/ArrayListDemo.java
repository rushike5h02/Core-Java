package com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// ..with duplicate elements and insertion order preserved.....Heterogeneous allowed

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// importing ArrayList
	ArrayList a1 = new ArrayList();     // Object creation for ArrayList
	
	// to add elements....since collection allow Heterogeneous elements
	
	a1.add(10);           // ...add(); ..method to add elements in arrayList                
	a1.add("Rushikesh");
	a1.add(20);
	a1.add(20);
	a1.add(null);     // as null ..is element/insertion is possible
	a1.add(null);

	a1.remove(2);      // to remove element......from..array Index...remove(array Index)...

	System.out.println("ArrayList is="+a1);
	
	System.out.println("Get Element="+a1.get(2));       // to get element at Array Index position
	
	// to get boolean answer.....for ELEMENT present of not
	
	System.out.println(a1.contains(50));       //....contains()...used check for ELEMENT=50 in element   
	 
	System.out.println("ArrayList Size is="+a1.size());        // to get size of ArrayList
	
// Use of Generic
	
	ArrayList<Integer> a2= new ArrayList<Integer>();
	a2.add(10);
	a2.add(40);
	a2.add(30);
//	a2.add("R");     // will give ClassCastException	
	
	a2.add(20);      
	a2.add(20);
	a2.add(70);
	a2.add(5,80);
	
	System.out.println(a2);
	
	int a=a2.get(3);
	System.out.println("4th index is="+a);
	
	System.out.println("first way="+a2);
	
// to traverse	
	
	Iterator<Integer> itr= a2.iterator();
	while(itr.hasNext()) { 
		System.out.println(""+itr.next());
	}
	
	for(Integer t : a2) {
		System.out.println("using for each loop="+t);
	}
	
	}

}
