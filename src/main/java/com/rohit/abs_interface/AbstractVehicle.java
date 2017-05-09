package com.rohit.abs_interface;

/*
 * Abstract Properties: 
 * 1. It can have main method.
 * 2. Every time when we try to create an object of an Abstract we have to define body
 * 	  of the abstract method. In this case we have to define body of abstract method 
 *    for every object.
 * 3. Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
 * 4. But, if a class has at least one abstract method, then the class must be declared abstract.
 * 5. To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
 * 6. If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
 */

public abstract class AbstractVehicle {
	
	private Double fuel;

	public AbstractVehicle(Double fuel) {
		super();
		this.fuel = fuel;
	}
	
	public void fillFuel(Double fuel){
		this.fuel = this.fuel+fuel;
	}
	
	public Double getFuel(){
		return this.fuel;
	}
	
	abstract public void speed(Double speed);
	
	
	public static void main(String arg[]){
		
		System.out.println("This is an abstract class");
	}
	

}
