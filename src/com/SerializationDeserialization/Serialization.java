package com.SerializationDeserialization;

//..Serialization....Serializable Interface.....FileOutputStream....to store state of object into file

// it writes file in Serializable...encrypted form


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serialization {

	public static void main(String[] args) {
	
		
		// create object
		
		Student s1 = new Student();
		s1.fname="Rushikesh";
		s1.lname="Bhand";
		s1.city ="Ahmednagar";
		
		// to store this value in file...and in case we need exception...we also use "try..catch..block"
		
		try {
			
		FileOutputStream fos = new FileOutputStream("E:\\Input1.txt");
		
		// to WRITE ..OBJECT...into FILE
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);   // object creation
		
		oos.writeObject(s1);    // write object using inbuilt methods
		
		oos.flush();     // to close/flush  the object
		
		System.out.println("Success...");      // as message for object creation succesfull....when no exception
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
