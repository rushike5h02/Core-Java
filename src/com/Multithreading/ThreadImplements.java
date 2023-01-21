package com.Multithreading;

public class ThreadImplements implements Runnable {      // by implementing " implements runnable"   interface
	
	
	
	
// adding unimplemented method
@Override
public void run() {
	for(int i = 1; i<=5; i++) {    
		System.out.println(i);
	}
}

public static void main(String[] args) {
	
	ThreadImplements demo = new ThreadImplements();
	
	Thread thread = new Thread(demo);   // we need to create object of Thread class ..to .."Start".. method
	
	thread.start();
}
}	
	
	
	


	
	
	
