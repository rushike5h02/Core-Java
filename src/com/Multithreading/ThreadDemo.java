package com.Multithreading;

public class ThreadDemo extends Thread{     // create thread by extending to Thread Class
	
public void run() {            // ...it is built in method
	for(int i = 1; i<=5; i++) {    
	System.out.println(i);
}
}
	public static void main(String[] args) {

		ThreadDemo threadDemo = new ThreadDemo();
		
		threadDemo.start();     // to start execution of Thread....it calls ..internally.. run method
		
	}

}
