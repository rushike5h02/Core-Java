package com.ExceptionHandling;

//....2..... Throw and Throws Method...

// ...throw....used to transfer Exception to someoneelse

// Syntax......throw   new  ArithmaticException
                        // Object creation

//...throws.....used to declare Exception with method

// Example....void m1() throws ArithmaticException{] m2(){}


//Important points to remember about throws keyword: 
//
//	throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
//	throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
//  By the help of throws keyword we can provide information to the caller of the method about the exception.
//


// ..."Custom Exception"....

// is used to create exception of our choice....for example we use in an project


//Steps to create the user defined exception
//1.	Create the new class.
//2.	The user defined exception class must extend from java.lang.Exception or java.lang.RunTimeException class.
//3.	While creating custom exception, prefer to create an unchecked, Runtime exception than a checked exception.
//4.	Every user defined exception class in which parametrized Constructor must called parametrized Constructor of either java.lang.Exception or java.lang.RunTimeException class by using super(string parameter always).


public class Explaination {

}

// Diferentiate exception and error

// exception is caused by application itself....error is mostly by enviornment in which application running
// exception recovered....error,,,non recoverable
// exception are runtime and compile time.....error are only runtime
// exception can be check and uncheck......all error are uncheck
// Examples....heirarchy

// difference bet  check and unchecked..




