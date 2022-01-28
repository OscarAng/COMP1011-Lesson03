package com.aoop;

public class Person {
	
	private float height, weight;
	private String name;
	
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
		this.setHeight( height );
		this.setWeight( weight );
		
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