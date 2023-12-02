package com.kosm.somepackage;

import com.kosm.annotations.AutoInjectable;
/**
 * Another public class that implements the interface SomeInterface that contains the function that does something
 */
public class SomeBean {
	/**
	 * Default constructor without parameters
	 */
	public SomeBean() {}
	/**
	 * The first field to be injected
	 */
    @AutoInjectable
    private SomeInterface field1;
    /**
     * The second field to be injected
     */
    @AutoInjectable
    private SomeOtherInterface field2;
    /**
     * Function that does something with fields
     */
    public void foo() {
        field1.doSomething();
        field2.doSomething();
    }
}