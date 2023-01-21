package com.Collection.Set;

import java.util.HashSet;

public class HashIntoHash {

	public static void main(String[] args) {
		
		
// HashSet...into..itself....and LinkedHashSet can be  added into itself	
		
		HashSet hashSet= new HashSet();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add("velocity");
		hashSet.add("pune");
		
		System.out.println(hashSet);
		
		HashSet hashSet1= new HashSet();
		
		hashSet1.add(40);
		hashSet1.add(50);
		hashSet1.add(60);

		System.out.println(hashSet1);
		
		hashSet.addAll(hashSet1);
		
		System.out.println(hashSet);

	}

}
