package com.Collection.Map;

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		// Stores Value in Key-Value pair
		// uses..put()..to add element with return type Object....put(object key, Object value)

		//..duplicate .key..not allowed.....duplicate..value..allowed
		// may have....null..key...only one,....null- value...multiple
				
				// insertion order  Preserved
		
		LinkedHashMap hm = new LinkedHashMap();
		
		hm.put(10, "ajay");
		hm.put(11, "ram");
		hm.put(12, "shyam");
		hm.put(12, "shyam");             // @ overrided.....duplicates ..Key Not Allowed
		hm.put(13, "shyam");         // ..duplicate Value Allowed
 
		hm.put(null, null);    // only Single null...key allowed
		hm.put(14, null);              // multiple ..null...values allowed
		
		hm.remove(10);         // remove key
		System.out.println(hm);
		
// ..to use Generic....	
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(10, "Ram"); 
		map.put(20, "yogesh"); //override 
		
// we need...Set.. interface to print the ...Key... in its form
		
		Set<Integer> s = map.keySet();
		
//....for Traversing		
		Iterator<Integer> itr = s.iterator();
		
		while (itr.hasNext()) {
			
// we can also use
			int i = itr.next();
			System.out.println("key=" + i);
			System.out.println("value=" + map.get(i));
		}

// Using ..For-each loop
		
		for (int i : s) {
			System.out.println("Key==" + i);            // to get the Key
			System.out.println("value=" + map.get(i));   // to get..Value of Key
		}



	}

}
