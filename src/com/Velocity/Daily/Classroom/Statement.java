package com.Velocity.Daily.Classroom;

public class Statement {

	public static void main(String[] args) {
	
	
		
		//  if statement  and    if else Statement
	
//		int age=20;
//		
//	if(age<=17){
//	System.out.println("Eligible to vote");
//	}
//	else {
//		System.out.println("Not eligible");
//	}
		
	
		// If-else-if Ladder
		
//		int x=20;
//		
//		if(x==15) {
//			System.out.println("Value is Wrong");
//		}
//		else if(x>=25) {
//			System.out.println("Value is Greater");
//		}
//		else if(x<=15) {
//			System.out.println("Value is Lesser");
//		}
//		else {
//		System.out.println("Wrong Input");
//		}
		
		
		
		
		// Nested if Statement
		
//		int x=20;
//		int y=30;
//		
//		if(x==20) {
//			if(y>=20) {
//				System.out.println("Value True");
//			}
//		}
//		else {
//			System.out.println("Wrong Value");
//		}
		
		
		
		// Switch Statement
//		
		int grade=5;
		String gradeType;
		
	switch(grade){
		
			case 1:
				gradeType="Distinction";
				break;
			case 2:
				gradeType="Good";
				break;
			case 3:
				gradeType="Moderate";
				break;
			case 4:
				gradeType="Bad";
                break;
			default:
				gradeType="Failed";
		}
				System.out.println(gradeType);
				
				
}
}