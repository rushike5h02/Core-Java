package com.ObjectasReturnType;

public class Employee {
	
		int id=10;
		String name="Rushikesh";
		String city="Ahmednagar";
		
		public      Employee            example() {             // only this will give error ..to genertae return type
			   // object as return type      // method name
			
			// so we create object for..to be used as return type..
			
			Employee obj = new Employee();
			System.out.println(obj);
			return obj;
		}
		
		// this will print ..hash code....of variable...so we use ...toString...to print data members...
		
		// generate ..toString()....for all fields..
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
		}
	
		
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.example();                  // we need to call this method to print in main method
		
		// also use.. by using ...static method....public static Employeee example()
		
		//example();
		
		
		
}
	}
	