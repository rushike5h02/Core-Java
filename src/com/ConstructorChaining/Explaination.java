package com.ConstructorChaining;

public class Explaination {

}

//Constructor chaining-

//A constructor is called from another constructor in the same class this process is known as constructor chaining. 

//It occurs through inheritance. 

//When we create an instance of a derived class, all the constructors of the inherited class (base class) are first invoked,
    // after that the constructor of the calling class (derived class) is invoked.

//Rules for constructor chaining-
//1.	An expression that uses "this" keyword must be the first line of the constructor.
//2.	Order does not matter in constructor chaining.
//3.	There must exist at least one constructor that does not use this keyword.

//How to achieve constructor chaining in two ways

//1.	Within the same class-
//If the constructors belong to the same class, we use ...."this"... keyword.

//2.	From the base class and derived class-....also called...."Chaining Inheritance"....
//If the constructor belongs to different classes (parent and child classes), 
     //we use the ...."super".. keyword to call the constructor from the base class.



// we can not use same argument in constructor

// we...CAN NOT...use                                         we....Can USE.....

// constructorA(int x){}                                   constructorA(int x){}
// constructorA(int x){}                                   constructorA(int x, int y){}