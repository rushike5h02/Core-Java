package com.Velocity.Daily.Classroom.OOPs.Encapsulation;

public class Student {
	
	private int fee;

	public int getFee() {
		return fee;                    // for """return""" keyword we need to use byte/short/int/double/float/string
	}                                          // as return type as ""void"" can not be used here

	public void setFee(int fee) {
		this. fee = fee;                  // ""this""..keyword is used for Current Class
	}

}
