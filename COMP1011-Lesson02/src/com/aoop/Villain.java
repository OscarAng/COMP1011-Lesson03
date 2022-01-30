package com.aoop;

public class Villain extends Hero {

	public Villain( String name ) {
		
		super( name );

	}

	// Public Methods
	public void steals() {
		
		System.out.println( this.name + " is Stealin'" );
		
	}
	
}
