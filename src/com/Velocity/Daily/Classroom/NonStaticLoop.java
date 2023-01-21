package com.Velocity.Daily.Classroom;
 
public class NonStaticLoop {

	public void For() {
		for(int a=1; a<=5; a++) {
	System.out.println("For a="+a);
		}
	}
		
		public void While() {
			int b=1;
			while(b<=5) {
				System.out.println("While b="+b);
			b++;
			}
		}
	
		public void DoWhile() {
			int c=1;
			do {
				System.out.println("Value c="+c);
			c++;
			}while(c<=5);
		}
	
	public static void main(String[] args) {
	
System.out.println("For Loop");
NonStaticLoop forLoop=new NonStaticLoop();
		forLoop.For();
		System.out.println("................................................");
		
		System.out.println("While Loop");
		NonStaticLoop whileLoop=new NonStaticLoop();
		whileLoop.While();
		System.out.println(".................................................");
		
		System.out.println("Do While Loop");
		NonStaticLoop doWhile=new NonStaticLoop();
		doWhile.DoWhile();
		System.out.println("..................................................");
	}

}
