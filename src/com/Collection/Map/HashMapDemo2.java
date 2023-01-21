package com.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

//	How to return map to method.....using Object as return Type	
	
//	 design method to return HashMap
	
public HashMap<Integer,String> addEmployee(){
			
//.....create object
	
	HashMap<Integer, String> hashMap= new HashMap<Integer,String>();
	
			hashMap.put(10, "rohan");
			hashMap.put(20, "sohan");
			hashMap.put(30, "velocity");
			return hashMap;                 // only return hashMap()...will print Empty Map....so we have to give elements 
		}
		
public static void main(String[] args) {

	//.....create object
	
		HashMapDemo2 hashMapDemo5= new HashMapDemo2();

//1st way......directly calling Object...limited to object		
			System.out.println("first way="+hashMapDemo5.addEmployee()); 
			

//2nd way....creating object of HashMap...limited to HashMap			
			HashMap<Integer, String> hashMap=hashMapDemo5.addEmployee();
			
			System.out.println("second way="+hashMap);
			
			
//3rd way......Creating Object of Map..interface...can be used for any class in ..Map interface......More Suitable to Use			
			Map<Integer, String> map= hashMapDemo5.addEmployee(); 
			
			System.out.println("third way="+map);
	
	}

}
