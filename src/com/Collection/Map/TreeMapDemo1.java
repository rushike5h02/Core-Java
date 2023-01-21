package com.Collection.Map;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class TreeMapDemo1 {

//	 if we dont want to use...Set ...for Iteration...we can use.....EntrySet....	
	
	public static void main(String[] args) {
		
// create Object of HashMap with reference to Map..interface		
		Map<String, String> map = new TreeMap<String, String>();
				
			map.put("10", "patil");
			map.put("20", "deshmukh");

// using iterators.....Map as generic.....Map does not have iterator()...so we use ...entrySet(0.iterator()
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 

		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();     // stores both key and values
					
			System.out.println("Key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
				}	
		
	}

}
