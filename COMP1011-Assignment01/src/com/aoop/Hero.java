package com.aoop;

public class Hero {
	
	// Private Properties
	private int strength;
	private int speed;
	private int health;
	
	// Public Properties
	public String name;
	
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
	
	private boolean hitAttempt() {

		int temp = ( int ) ( Math.random() * 10 + 1 );
		
		if( temp <= 2 ) return true;
		
		return false;
		
	}
	
	private int hitDamage() {
		
		return ( this.strength * ( int )  ( Math.random() * 6 + 1 ) );
		
	}
	
	// Public Methods
	public void fight() {
		
		if( hitAttempt() ) System.out.println( this.name + " caused " + hitDamage() + " damage to the target!" );
		else System.out.println( this.name + " failed to hit the target!" );
	
	}
	
	public void show() {
		
		System.out.println( "--------------" );
		System.out.println( " Strength: " + this.strength );
		System.out.println( " Speed: " + this.speed );
		System.out.println( " Health: " + this.health );
		System.out.println( "--------------" );
		
	}
	
}
