package com.ExceptionHandling;

//....throw....example


public class InsufficientFundException extends RuntimeException {          // make it sub class of ...throwables...

	private String msg;

	// call the constructor
	
	public InsufficientFundException(String msg) {
//		super();
//		this.msg = msg;
	
	// but we will use
		
		super(msg);
	}
	

	
	
}
