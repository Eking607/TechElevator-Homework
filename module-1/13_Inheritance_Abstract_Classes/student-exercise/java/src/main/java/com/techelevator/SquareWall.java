package com.techelevator;

public class SquareWall extends Wall {
	
	private int sideLength;



	public SquareWall(String name, String color, int sideLength) {
		super(name, color);
		this.sideLength = sideLength;
	}
	

	
	public int SideLength() {
		return sideLength;
	}


	
	public int getArea() {
		return sideLength * sideLength;
	}
	
	public String toString() {
		
		return this.getName() + " " + "(" + sideLength + "x" + sideLength + ")" + " " + "square";
		
	}
}
