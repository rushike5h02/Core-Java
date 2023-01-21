package com.Multithreading;


//......Life Cycle of Thread

// 1....New/Born State............Before invocation of start method

//.2... Runnable state.......After invocation of Start method

//..3...Running State.......it is thread scheduler inside JVM has decided.......thread currently executing

//.4....Dead State........A Thread is terminated is under dead state

//.5...Waiting State.....when thread is temporarily inactive....may be beacuse of shortage of resource
       // wait();...method

//.6....Sleep State......When we call sleep method for particular time...want another in sleep during that period
        // sleep();....method

// 7.....Suspended State.....When we call ..suspend();..method in Sleep state it goes to Suspended State

// 8.....Resume State.....If resume execution of thread currently under Waiting/Sleep/Suspended State
        //  resume();...method
     // notify();....method to resume Waiting State





public class LifeCycleOfThread {

}
