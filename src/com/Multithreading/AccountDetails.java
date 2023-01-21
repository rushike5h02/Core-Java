package com.Multithreading;

public class AccountDetails implements Runnable{       // using Runnable interface for multithreading

Account account = new Account();
	
	// add unimplemented methods...for Runnable interface
	@Override
	public  void run() {

// ...Example...we nedd to create threads to run for...5..times		

	for (int x=0; x<5; x++) {
		makeWithdraw(500);
		if(account.getBalance()<=0) {
			System.out.println("Account Overdrawn");
		}
	}
	}

//	private void makeWithdraw(int amt) {      // for Un-Synchronized Thread execution
		
// in case we want Thread execution Synchronized.....One thread execution and after its completion execution of other Thread		
		
	 synchronized void makeWithdraw(int amt) {
		
	if (account.getBalance()>=amt) {   // // check balance grater or not
		System.out.println(Thread.currentThread().getName()+" is going to Withdraw");   // to know Thread in running state...currently executiong
	}
// until this is executing we want other thread to be in sleep state.....case.. not applicable in case of synchronization 			
	
	// when using Synchronized......dont use... sleep()...method
//	try {
//		Thread.sleep(100);    // each thread goes to sleep state for 100 ms
//	}catch (Exception e) {
//		e.printStackTrace();
//	}
	
// each thread allocating same resource....withdraw	
	
	int bal = account.withdraw(amt);
	
	System.out.println(Thread.currentThread().getName()+" Completed withdraw Operation "+bal);
	
	}    

}
