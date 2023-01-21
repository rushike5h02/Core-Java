package com.PropertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

// Properties Files...are used to store configurations..example...password, data base drivers

// when we need to make changes in any class it will require change in entire project
    //.......or.....
// when we change address of data base we need to change its address in project tooo

// to avoid this we use....Property File.....to store configurations

// property Files........Key Value pair

             //       key     Value           
//Example..        userName=Rushikesh
//                 password=rushikesh02



public class PropertiesFile {

	public static void main(String[] args) {
		
		// create a file with above example as data...Save..Sample.propertie...for properties file ..Save as Type ..All files
		

		//if we want to read file on console
		
		try {
			
			// to read file...properties file
			
			FileInputStream fis = new FileInputStream("E:\\Sample.properties");
			
			// create object of properties Class...inbuilt
			
			Properties p = new Properties();
			
			// Call Load method of Properties class...to load the file...properties file
			
			p.load(fis);           // argument is...object of Input Stream
			
			// .. getProperty ..method in property class to call value
			
			// to get username from file
			                           // string Key 
			String uname= p.getProperty("userName");    
			
			// to get password from file
			                         // string Key
			String pass= p.getProperty("password");
			
			// to print these variables 
			
			System.out.println("UserName="+uname);
			System.out.println("Password="+pass);
			
		}catch (Exception e){
			//System.out.println(e);
			e.printStackTrace();
		}
		
		
	}

}
