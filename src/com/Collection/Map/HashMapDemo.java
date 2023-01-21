package com.Collection.Map;

import java.util.HashMap;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
// Stores Value in Key-Value pair
// uses..put()..to add element with return type Object...put(object key, Object value)

//..duplicate .key..not allowed.....duplicate..value..allowed
// may have....null..key...only one,....null- value...multiple
		
		// insertion order Not Preserved
		
		HashMap hm = new HashMap();
		
		hm.put(10, "ashok");
		hm.put(11, "ram");
		hm.put(11, "ram");     // @ overrided.....duplicates ..Key Not Allowed
		hm.put(12, "ram");     // ..duplicate Value Allowed
		
		hm.put(null, null);    // only Single null...key allowed
		hm.put(14, null);              // multiple ..null...values allowed
		 
		hm.remove(10);         // remove key
		System.out.println(hm);
		
// ..to use Generic....
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Ramesh");
		map.put(200, "yogesh");
		map.put(300, "sohan");

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
