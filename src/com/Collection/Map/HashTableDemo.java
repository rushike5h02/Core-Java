package com.Collection.Map;

import java.util.*;

public class HashTableDemo {

			// Stores Value in Key-Value pair
			// uses..put()..to add element with return type Object...put(object key, Object value)
//	It cannot have null keys or null values. 
    //It gives runtime error if we try to add any null keys or values but will not show an error at compile time
	
	// // insertion order Not Preserved
	
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		
		ht.put(10, "ram");
		ht.put(11, "sohan");
		ht.put(11, "ram");     // @ overrided.....duplicates ..Key Not Allowed
		ht.put(12, "ram");     // ..duplicate Value Allowed
		
//		ht.put(null, null);    // null....Key and...Null...Value....both....NOT Allowed......give...NullPointerException
//		ht.put(14, null);             
		
		ht.remove(10);         // remove key
		System.out.println(ht);
		
// ..to use Generic....
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(10, "Ram");
			map.put(20, "yogesh");
			map.put(30, "sohan");

// we need...Set.. interface to print the ...Key... in its form
			
		Set<Integer> s = map.keySet(); // s contain all the keys only.

//....for Traversing

// Using ..For-each loop		
		for (int i : s) {
			System.out.println("Key==" + i);            // to get the Key
			System.out.println("value=" + map.get(i));   // to get..Value of Key
				}

// ...Using the Iterator
				
		Set<Integer> s1 = map.keySet();
				
		Iterator<Integer> itr = s1.iterator();
		
		while(itr.hasNext()) {   // to check next element present or not
			
			int i = itr.next();      // it becomes easy..to write...and doesnt give ...Exception
			System.out.println("Key==" +i);       // to get the Key
			System.out.println("value==" +map.get(i));    // to get..Value of Key
		}
		
	}

	
}
