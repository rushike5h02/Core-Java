package com.Velocity.Daily.Classroom;

public class LoopingStatement { 

	public static void main(String[] args) {
		
		// For loop
		
		System.out.println("For Loop");
		
		for(int f=1; f<=5; f++) {
System.out.println("Value of="+f);
	}
		
		System.out.println(".......................................");
		
				// While Loop
		
				System.out.println("While Loop");
		
		int w=5;
		
		while(w>=1) {
			System.out.println("Value of w="+w);
			w--;    // operation
		}
		
		System.out.println("........................................");
		
		// Do While Loop
		
		System.out.println("Do-While Loop");
		int d=1;
		
	do {
		System.out.println("Value of d="+d++);
	d++;   //  operation
	}while(d<=10);
	
	System.out.println("...............................................");
	
	System.out.println("Jumping Statement");
	// Jumping statement..... Types....1. Break....2.Continue
	
			// break statement....to terminate flow of program
			
			System.out.println("Break Statement for break at 7=");
			
			for(int i=1; i<=10; i++) {   // in if-loop it will continue till 10 but if we want to break flow at certain point
				
				if(i==7) {      // it will give condition to be achieved
					break;      // and them break the flow or execution thats why we use break and print answer till condition
				}
				
				System.out.println("Vslue ="+i);
			
			}
			
			System.out.println(".....................");
			
			// continue statement....to skip the condition and continue the flow
			
			System.out.println("Continue Statement for continue at 7=");
			
			for(int i=1; i<=10; i++) {       // it will continue till 10 but if we want to skip certain condition and continue
				if(i==7) {             // it provides the condition
					continue;        // it will wxecute till condition satisfied then skip condition and continue execution
				}
				System.out.println(i);
			}

		
		
	}
}
