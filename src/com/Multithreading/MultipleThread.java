package com.Multithreading;

public class MultipleThread  extends Thread{

	public void run() {
		for (int i =1; i<=5; i++) {
			System.out.println(i);
		
	// it will print anser ...as..1 1 2 2 3 3 4 4 5 5
			
	// but ..using sleep();...method we can stop execution of thread for...fixed time in ..miliseconds
			try {
				Thread.sleep(500);            // sleep(500);...sleep execution for..500 miliseconds
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)  {
		
		MultipleThread e1 = new MultipleThread();           // are ..2.. threads
		MultipleThread e2 = new MultipleThread();

		e1.start();    // calls run method
		e2.start();   
		
		// methods inside Thread
		
//		MultipleThread test = new MultipleThread();
		
//		System.out.println(test.getId());     // id given by JVM
//		System.out.println(test.getName());   // Name by JVM
//		System.out.println(test.getPriority());    // Priority of execution decided by JVM
//		System.out.println(test.getState());       // State of thread....since it is new
//		
//		System.out.println(test.getClass().getTypeName());    // to know name of class
	}
}
