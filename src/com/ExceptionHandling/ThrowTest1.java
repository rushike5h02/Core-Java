package com.ExceptionHandling;

public class ThrowTest1 {

	public static void main(String[] args) {
		
		try {

			throw new ThrowTest("Invalid input");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	}


