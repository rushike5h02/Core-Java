package com.SerializationDeserialization;

import java.io.Serializable;

//..Serialization...SSerializable Interface...FileOutputStream....to store state of object into file
  // it writes file in Serializable...encrypted form

//...Deserialization....Deserializable Interface.....FileInputStream...to read object from file seriaalized
   // it reads serialized/encrypted file...into readable form

public class Student implements Serializable {

	String fname;
	String lname;
	String city;
	 
 //transient String city;
	
   
    
    
    
    
}

// ......Transient....Keyword.....

// when we dont need to us eparticular keyword we use....transient

// example.....transient String city...then it will not be used for reading or writting

// When ...Transient... is used 

// in...Serializable.....that variable will not be printed

// in..deserializable......null...value will be printed instead of that variable