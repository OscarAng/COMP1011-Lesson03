package com.aoop;

public class Vigilante extends Villain {
	
	// Constructor
	public Vigilante( String name ) {
		
		super( name );

	}
	
	// Public Methods
	public void dealsJustice() {
		
		System.out.println( this.name + "is dealin' Justice, baby" );
		
	}

}
