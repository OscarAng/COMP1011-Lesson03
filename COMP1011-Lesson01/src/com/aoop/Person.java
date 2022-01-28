package com.aoop;

public class Person {
	
	private float height, weight;
	
	public float getHeight() {
		
		return height;
		
	}

	public void setHeight( float height ) {
		
		this.height = height;
		
	}

	public Person( float height, float weight ) {
		
		this.setHeight(height);
		this.weight = weight;
		
	}
	
	public void walks() {
		
		this.weight *= 0.9;
		System.out.println( "You lost weight!" );
		System.out.println( "You weigh: " + this.weight + "lbs" );
		
	}
	
	public void eats() {
		
		this.weight *= 1.2;
		System.out.println( "You gain weight!" );
		System.out.println( "You weigh: " + this.weight + "lbs" );
		
	}
	
}