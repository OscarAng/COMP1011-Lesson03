package com.aoop;

public class StrongMan extends Hero {
	
	public StrongMan( String name ) {
		
		super( name );
		this.boostStrength();
		
	}
	
	// Private Methods
	private void boostStrength() {
		
		this.strength += 50;
		
		if( this.strength > 100 ) this.strength = 100;
		
		
	}

}
