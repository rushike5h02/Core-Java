package com.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//...Deserialization....Deserializable Interface....FileInputStream...to read object from file seriaalized
// it reads serialized/encrypted file...into readable form



public class Deserialization {

	public static void main(String[] args) {
		
		try {
			
			// to call file ...to deserialize...to decrypt
			
			FileInputStream fis = new FileInputStream("E:\\Input1.txt");
			
			// to read file...object creation by inbuilt methods
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// calling  methods to read file
			   // since we don't know type of data we are reading
			Object obj = ois.readObject();    // from Object.....when we dont know class where to read
			
			//then  to store object into Student..thats class we know 
			
			Student s = (Student) obj;     // Explore..."Add cast .Student."..type casting converts one type to other
			
			System.out.println(s.fname);
			System.out.println(s.lname);
			System.out.println(s.city);
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
