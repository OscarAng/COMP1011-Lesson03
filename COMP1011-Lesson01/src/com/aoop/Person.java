package com.aoop;

public class Person {
	
	private float height, weight;
	private String name;
	private int IQ;
	
	public float getHeight() {
		
		return height;
		
	}

	public float getWeight() { 
		
		return weight;
		
	}
	
	public void setHeight( float height ) {
		
		this.height = height;
		
	}
	
	

	public void setWeight( float weight ) {
		
		this.weight = weight;
		
	}
	
	public Person( String name, float height, float weight ) {
		
		this.name = name;
		
		// Removed Setter and used direct property access
		this.height = height;
		this.weight = weight;
		
	}

	public void walks() {
		
		this.weight *= 0.9;
		System.out.println( this.name + " lost weight!" );
		System.out.println( this.name + " weighs: " + this.weight + "lbs" );
		
	}
	
	public void eats() {
		
		this.weight *= 1.2;
		System.out.println( this.name + " gained weight!" );
		System.out.println( this.name + " weighs: " + this.weight + "lbs" );
		
	}
	
}
