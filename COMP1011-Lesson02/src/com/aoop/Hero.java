package com.aoop;

public class Hero {

	// Private Properties
	private int strength, speed, health;
	
	// Public Properties
	public String name;
	
	// Getters
	public int getStrength() { return strength; }
	public int getSpeed() { return speed; }
	public int getHealth() { return health; }

	// Constructor
	public Hero( String name ) {
		
		this.name = name;
		
		generateAbilities();
		
	}
	
	// Private Methods
	private void generateAbilities() {
		
		this.strength = ( int ) ( Math.random() * 100 + 1 );
		this.speed = ( int ) ( Math.random() * 100 + 1 );
		this.health = ( int ) ( Math.random() * 100 + 1 );
		
	}
	
	// Public Methods
	public void showAbilities() {
		
		System.out.println( "-----------------------------" );
		System.out.printf( "Strength: %d", this.strength );
		System.out.printf( "Speed: %d", this.speed );
		System.out.printf( "Health: %d", this.health );
		System.out.println( "-----------------------------" );
		
	}
	
	public void fight() {
		
		System.out.printf( "%s is Fighting", this.name );
		
	}
	
	public void run() {
		
		System.out.printf( "%s is Running", this.name );
		
	}
	
}
