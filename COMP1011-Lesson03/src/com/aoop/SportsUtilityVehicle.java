package com.aoop;

public class SportsUtilityVehicle extends Vehicle {

	// Constructor
	public SportsUtilityVehicle( String colour, String make, String model, String year ) {
		
		super( colour, make, model, year );
		
		this.numDoors = 5;
		
	}

	// Overridden Public Methods
	@Override
	public void accelerate() {
		
		this.speed += 4;
		if( this.speed >= this.MAX_SPEED ) this.speed = this.MAX_SPEED;
		
	}

	@Override
	public void decelerate() {

		this.speed -= 6;		
		if( this.speed < 0 ) this.speed = 0;
		
	}

}
