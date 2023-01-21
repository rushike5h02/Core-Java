package com.Multithreading;

public class AccountMainClass {

	public static void main(String[] args) {
		
	  AccountDetails accountDetails = new AccountDetails();
	  
	  Thread t1 = new Thread (accountDetails);        // threads
	  Thread t2 = new Thread (accountDetails);

	  // to give name to Threads...else name would be given by JVM
	  
	  t1.setName("ITC");
	  t2.setName("Sundaram");
	  
	  // start execution of Thread
	  
	  t1.start();
	  t2.start();
	  
	}

}
