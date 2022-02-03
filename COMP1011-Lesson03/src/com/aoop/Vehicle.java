package com.aoop;

public abstract class Vehicle {

	// Private Properties
	protected int numWheels = 4;
	protected int numDoors = 2;
	
	protected float speed = 0;
	
	protected String colour = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	
	protected final int MAX_SPEED = 40;
	
	// Getters
	public int getNumWheels() { return this.numWheels; }
	public int getNumDoors() { return this.numDoors; }
	public float getSpeed() { return this.speed; }
	public String getColour() { return this.colour; }
	public String getMake() { return this.make; }
	public String getModel() { return this.model; }
	public String getYear() { return this.year; }
	
	// Constructor
	public Vehicle( int wheels, int doors, String colour, String make, String model, String year ) {
		
		this.numWheels = wheels;
		this.numDoors = doors;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	// Constructor
	public Vehicle( String colour, String make, String model, String year ) {
		
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	// Public Abstract Methods
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	// Public Methods
	public void turnLeft() {
		
		System.out.println( "Turning Left" );
		
	}
	
	public void turnRight() {
		
		System.out.println( "Turning Right" );
		
	}
	
}
