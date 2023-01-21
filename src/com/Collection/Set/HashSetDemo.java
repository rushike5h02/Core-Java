package com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {        // used when frequent operation is search

	public static void main(String[] args) {
		
// Insertion Order Not Preserved........duplicates Not allowed....heterogeneous allowed,....null allowed olny once		

		HashSet hashSet = new HashSet();
		
		hashSet.add("ram");
		hashSet.add("shyam");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add("ram"); // return false
		
		System.out.println(hashSet);

		Iterator itr1=hashSet.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(10);
		hash.add(20);
		hash.add(30);

		System.out.println(hash);

// traversing
		for (int t : hash) {
			System.out.println(t);
		}
		
		HashSet<String> hashS = new HashSet<String>(); // 16 internally size increase
		hashS.add("10"); // 16*0.75 =12
		hashS.add("20");
		hashS.add("30"); // 13th element
		hashS.add(null);

// for Traversing...
		Iterator<String> itr2 = hashS.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
