package com.Velocity.Daily.Classroom;

public class StaticKeyword {
	
	int a = 10;
	static int b = 10;
	

	public static void main(String args[]) {                        // main method is Static Method
		
		// Static is  SIngle Copy Storage
		// Static belongs to class rather than object of class.
		// Static loads into memory before object creation...


		StaticKeyword step1 = new StaticKeyword();
		System.out.println("Non Static Keyword="+step1.a++);     
		System.out.println("Static Keyword="+step1.b++);
		
		StaticKeyword step2 = new StaticKeyword();
		System.out.println("Non Static Keyword="+step2.a++);
		System.out.println("Static Keyword="+step2.b++);
		
		StaticKeyword step3 = new StaticKeyword();
		System.out.println("Non Static Keyword="+step3.a++);
		System.out.println("Static Keyword="+step3.b++);
		
		StaticKeyword step4 = new StaticKeyword();
		System.out.println("Non Static Keyword="+step4.a++);
		System.out.println("Static Keyword="+step4.b++);



	

		

	}

}
