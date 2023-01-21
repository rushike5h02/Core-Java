package com.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CombinationOfArrayLisAndHashMap {

//	Suppose, I have business requirement as below
//	Business requirements-
//	India ---Maharashtra..Pune,Mumbai,Nagpur  ---Karnataka...Bangalore,mysore   -----Madhyapradesh.....indore,Bhopal

	
	public static void main(String[] args) {
		
// To get ..ArrayList of Districts		
		ArrayList<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("nagpur");

		ArrayList<String> karnataka = new ArrayList<String>();
		karnataka.add("bangalore");
		karnataka.add("mysore");

		ArrayList<String> madhyapradesh = new ArrayList<String>();
		madhyapradesh.add("indore");
		madhyapradesh.add("bhopal");

// to get name of States...with state code and Districts....as Key-Value pair....Take ArrayList ..as Input Value		
		HashMap<String, ArrayList<String>> hmstate = new HashMap<String, ArrayList<String>>();
		hmstate.put("MH", maharashtra);
		hmstate.put("KAR", karnataka);
		hmstate.put("MP", madhyapradesh);

// to get name of India...with India and States....as Key-Value pair....Take State as Key-Value Pair			
		HashMap<String, HashMap<String, ArrayList<String>>> hmcountry = new HashMap<String, HashMap<String, ArrayList<String>>>();
		hmcountry.put("India", hmstate);

// iterate and print the data....we need Set to covert hashMap 

		Set<String> s = hmcountry.keySet();        // will print ..hmstate..object

		for (String str : s) {  
			System.out.println(str);
			System.out.println(hmcountry.get(str));
		}

		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
			
			String i = itr.next();
			
			System.out.println(i);
			System.out.println(hmcountry.get(i));
		}
		
		

	}

}
