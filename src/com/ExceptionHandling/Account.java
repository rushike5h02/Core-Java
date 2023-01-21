package com.ExceptionHandling;

// ...thow....example


public class Account {
 
	private int balance=3000;        // global variable
	                                   // it represent Encapsulation
	public int balance() {
		return balance;
	}
	
	public void withdraw (int amount)  {              // parameter
		
	// if we want to print the balance
		
		if(amount>balance) {
			              // throw an exception......msg an Argument
		throw new InsufficientFundException("Insufficient Balance");      // arguments	
			
		}
		balance=balance-amount;            // to update the balance if changed
	}
	public static void main(String[] args) {
	
		// Callling method to withdraw
		
	Account ac = new Account();
	
	System.out.println("Current Balance="+ac.balance);      // calling the global variable       

	
	// to withdraw
	
	ac.withdraw(3500);
	
	System.out.println("Balnce After Withdrawl="+ac.balance);
	
	
	// it will give ...error with the Exception and Exception msg
	
	// but ,  following  will not execute ..if statement and will return new updated balance 
	
//	ac.withdraw(2000);
	
//	System.out.println("Balnce After Withdrawl="+ac.balance);
	
	}

}
