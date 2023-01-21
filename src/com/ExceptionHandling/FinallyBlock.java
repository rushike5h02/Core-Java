package com.ExceptionHandling;

// finally....is used to print ..imp part...executed always... even there is exception or not

// Finally block....will not be executed only when "JVM" is shut down(System.exit)

public class FinallyBlock {

	public static void main(String args[]){    
		  try{    
		   int data=25/5;    
		   	System.out.println(data);    
		  }    
		  catch(NullPointerException e){  
		System.out.println(e);  
		}      
		 finally {  
		System.out.println("finally block is always executed");  
		}        
//		System.out.println("rest of the code...");    
		  }    

	
}
