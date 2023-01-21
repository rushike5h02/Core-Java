package com.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapdemo1 {

// if we dont want to use...Set ...for Iteration...we can use.....EntrySet....	
	
	public static void main(String[] args) {
		
// create Object of HashMap with reference to Map..interface		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("ram", "patil");
		map.put("ajay", "deshmukh");

// using iterators.....Map as generic.....Map does not have iterator()...so we use ...entrySet(0.iterator()
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 

		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();     // stores both key and values
			
			System.out.println("Key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
		}


	}

}
