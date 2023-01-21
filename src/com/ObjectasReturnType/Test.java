package com.ObjectasReturnType;

public class Test {
       
	// if we want to print only ....one variable
	
//      	public static Customer CustomerById() {
//      		int id=10;
//      		return     new Customer(id);
                       //it defines object       	
//	}
	
	
	//  for...multiple variables
	
      	public static Customer CustomerData() {
      		int id=19;
      		String name="Rushikesh";
      	    String city="Ahmednagar";
      		
      	    return new Customer(id,name,city);         // returns multiple value from object here
      	    
      	}
	
	public static void main(String[] args) {
		
	// for....one variable	
		
//		Customer c=getCustomerById();
//		System.out.println(c.id);

		// for....multiple variables
		
		Customer d=CustomerData();
		
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.city);
		
		
	}

}
