package com.rohit.abs_interface;

public class Car extends AbstractVehicle {

	public Car(Double fuel) {
		super(fuel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speed(Double speed) {
		System.out.println("Car is speeding up by speed");
		
	}
	
	
	public static void main(String arg[]){
		
	
		
		AbstractVehicle vehical= new AbstractVehicle(10.00) {
			@Override
			public void speed(Double speed) {
				// TODO Auto-generated method stub
				System.out.println("defining when object initciated");
			}
		};
		
		System.out.println(vehical.getFuel());
		
		
		
	}

}
