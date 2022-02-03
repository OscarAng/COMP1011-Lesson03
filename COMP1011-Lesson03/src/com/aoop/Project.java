package com.aoop;

public class Project {

	public static void main( String[] args ) {
		
		SportsUtilityVehicle myHonda = new SportsUtilityVehicle( "Black", "Honda", "Pilot", "2015" );
		
		Truck myFord = new Truck( 6, 3, "White", "Ford", "FX", "2008" );
		
		for( int seconds = 0; seconds < 10; seconds++ ) {
			
			myHonda.accelerate();
			myFord.accelerate();
			
		}
		
		System.out.println( "Vehicle Speed: " + myHonda.getSpeed() );			
		System.out.println( "Truck Speed: " + myFord.getSpeed() );
		
	}
	
}
