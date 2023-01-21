package com.Velocity.Daily.Classroom;

public class JumpingStatement {

	public static void main(String[] args) {
	
		// Jumping statement..... Types....1. Break....2.Continue
		
		// break statement....to terminate flow of program
		
		System.out.println("Break Statement for break at 7=");
		
		for(int i=1; i<=10; i++) {   // in if-loop it will continue till 10 but if we want to break flow at certain point
			
			if(i==7) {      // it will give condition to be achieved
				break;      // and them break the flow or execution thats why we use break and print answer till condition
			}
			System.out.println("Value ="+i);
		}
		
		System.out.println(".................................................");
		
		// continue statement....to skip the condition and continue the flow
		
		System.out.println("Continue Statement for continue at 7=");
		
		for(int i=1; i<=10; i++) {       // it will continue till 10 but if we want to skip certain condition and continue
			if(i==7) {             // it provides the condition
				continue;        // it will wxecute till condition satisfied then skip condition and continue execution
			}
			System.out.println("Value ="+i);
		}
		

	}

}
