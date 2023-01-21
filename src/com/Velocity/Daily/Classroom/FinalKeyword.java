package com.Velocity.Daily.Classroom;

public class FinalKeyword {
	
	// final is used to make data member CONSTANT.....its value can not be changed

	public static void main(String[] args) {
	
	}
// ..1....Final Variable.....variable declared with "final" keywoed...its value can not be changed		

		//Ex.
		
	final int a=5;
	// it will gave compile time error
	
//	for (a=5; a<=10; a++) {
//		System.out.println(a);
//	}
	
	
//.....2......Final Method....it can not "Override"  "final" method...declared by "final" keyord
	
	
   final void demo() {
	   System.out.println("Method Demo=");
   }
	// it will give compile time error in next class
   
  // class Test extends Demo(){
   // @ override
	
	
//........3.....Final class.....class declared by "final" keyword
   
   // it cn not be "Inherited" or "overrided"
   
  final class Test{
	  
  }
	
	
		
	
	
	
	
	

}
