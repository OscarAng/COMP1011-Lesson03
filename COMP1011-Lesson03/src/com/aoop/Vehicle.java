package com.aoop;

public class Vehicle {

	// Private Properties
	private int numWheels = 4;
	private int numDoors = 2;
	
	private float speed = 0;
	
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	
	private final int MAX_SPEED = 40;
	
	// Getters
	public int getNumWheels() { return this.numWheels; }
	public int getNumDoors() { return this.numDoors; }
	public float getSpeed() { return this.speed; }
	public String getColour() { return this.colour; }
	public String getMake() { return this.make; }
	public String getModel() { return this.model; }
	public String getYear() { return this.year; }
	
	// Constructor
	public Vehicle() {
		
	}
	
	// Public Methods
	public void accelerate() {
		
		this.speed += 4;
		if( this.speed >= this.MAX_SPEED ) this.speed = this.MAX_SPEED;
		
	}
	
	public void decelerate() {
		
		this.speed += 6;		
		if( this.speed < 0 ) this.speed = 0;
		
	}
	
	public void turnLeft() {
		
		System.out.println( "Turning Left" );
		
	}
	
	public void turnRight() {
		
		System.out.println( "Turning Right" );
		
	}
	
}
