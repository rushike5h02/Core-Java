package com.Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayToHashSet {

	public static void main(String[] args) {
		// Such Conversion Can be done between  Interfaces and Classes
		
				//List...to...list
				//Set....to ...set
				// Map...to Map
				
				// List..classs ...to ...List..Class
				// set.class....to Set.class
				// Map.class...to Map class.............only
				
				// List.class to Set Class.....or Vice Versa
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10); 
		a1.add("Rushikesh");
		a1.add(20);
		a1.add(20);
		a1.add(null);
		a1.add(null);
		
		System.out.println("ArrayList is="+a1);
		
		// to convert To other Class..even in Other Interface.....give Object ...as argument
		
		HashSet hashSet = new HashSet(a1);
		
		System.out.println(hashSet);
		
Iterator itr=hashSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());


	}

	}
}
