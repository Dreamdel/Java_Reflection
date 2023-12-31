package com.kosm.somepackage;

/**
 * Another public class that implements the interface SomeInterface that contains the function that does something
 */
public class OtherImpl implements SomeInterface {
	/**
	 * Default constructor without parameters
	 */
	public OtherImpl() {}
	/**
	 * A function that does something (prints "B")
	 */
    public void doSomething() {
    	System.out.println("B");
    }
}