package com.aoop;

public class Player {
	
	public static void main( String[] args ) {
		
		int year = 2022;
		System.out.println( "Hello World! It's " + year + "!" );
		
		Person tom = new Person( "Tom", 6.2f, 200.9f );		
		tom.walks();
		
		Person mike = new Person( "Mike", 7.2f, 205.5f );
		mike.walks();
		
		Person matt = new Person( "Matt", 6.7f, 202.7f );
		matt.eats();
		
	}
	
}
