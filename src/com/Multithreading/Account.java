package com.Multithreading;

public class Account {
 
	private int balance = 5000;       // we have set value 

	public int getBalance() {       // using getter..setter method
		return balance;
	}

	public int withdraw (int amt) {
		balance = balance-amt;
		return balance;
	}
	
}
