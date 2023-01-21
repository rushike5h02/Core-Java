package com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
// Insertion Order Preserved........duplicates Not allowed....heterogeneous allowed,....null allowed olny once 

		
		LinkedHashSet hashSet = new LinkedHashSet();
		
		hashSet.add("ram");
		hashSet.add("shyam");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add("ram"); // return false
		System.out.println(hashSet);

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);

		System.out.println(linkedHashSet);

// traversing
		for (int t : linkedHashSet) {
			System.out.println(t);
		}
		
		Iterator itr = linkedHashSet.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
