package com.Multithreading;

//Is a process of executing multiple threads simultaneously
// thread...is a sub process.....smallest unit of program

//1...Process based

// multiple task performed same time but not related to each other
// ex...windows Task manager

//..2....Thread based

// multiple threads of same program executed simultaneously

// ..how can we create...Thread

//..1...By extending Thread class......"extends Thread"....class

// If class is not extended to any other class we can use "extends Thread" class

//...2....by implementing Runnable interface......"implements Runnable"........interface

// when our class is extended to other class then we can use..Runnable interface



// ...Synchronization.....allocates resources to only one thread till its execution and then to next thread


//Methods-
//
//1.	public void run(): is used to perform action for a thread.
//2.	public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
//3.	public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
//4.	public void join(): waits for a thread to die.
//5.	public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
//6.	public int getPriority(): returns the priority of the thread.
//7.	public int setPriority(int priority): changes the priority of the thread.
//8.	public String getName(): returns the name of the thread.
//9.	public void setName(String name): changes the name of the thread.



public class Explaination {

}
