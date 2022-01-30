package com.aoop;

public class Villain extends Hero {

	// Constructor
	public Villain( String name ) {
		
		super( name );

	}

	// Public Methods
	public void steals() {
		
		System.out.println( this.name + " is Stealin'" );
		
	}
	
	public void kills() {
		
		System.out.println( this.name + " is goin' around killin'" );
		
	}
	
}
