package com.Collection.Map;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		
//	The TreeMap is a class which implements NavigableMap interface which is the sub- interface of SortedMap.
//	It stores values based on key
//	It is ordered but in an Ascending manner
//	Keys should be unique
//	It cannot have null key at run time but can have null values because the interpreter will not understand how to sort null with other values.

		
		// ordered but in an Ascending manner

		TreeMap hm = new TreeMap();
		
		hm.put(10, "Ajay");
		hm.put(11, "ram");
		hm.put(11, "ram");     // @ overrided.....duplicates ..Key Not Allowed
		hm.put(12, "shyam");
		hm.put(13, "ram");     // ..duplicate Value Allowed
		
		hm.put(15, null);     //  null...key ...Not...allowed
		hm.put(14, null);              // multiple ..null...values allowed
		
		hm.remove(10);         // remove key
		System.out.println(hm);

// ..to use Generic....			
		
		TreeMap<String,String> treeMap= new TreeMap<String,String>(); //sorted elements based on key
		
		treeMap.put("20","velocity");
		treeMap.put("50","pune");
		treeMap.put("10","software");
		System.out.println(treeMap);
		
// we need...Set.. interface to print the ...Key... in its form	
		
		Set<String> s=treeMap.keySet();
		
//....for Traversing	
		
		for(String i: s) {
			System.out.println("key="+i);
			System.out.println("value="+treeMap.get(i));
		}
// Using....iterator
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {   // to check next element present or not
			
			String i = itr.next();      // it becomes easy..to write...and doesnt give ...Exception
			System.out.println("Key==" +i);       // to get the Key
			System.out.println("value==" +treeMap.get(i));    // to get..Value of Key
	}
	}
}
