package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the length: ");
	
		String userInput = keyboard.nextLine();
		double length = Double.parseDouble(userInput);
		
		System.out.print("Is the measurement in (m)eter, or (f)eet?: ");
		
		String userInputType = keyboard.nextLine();
	

		System.out.println(length + userInputType +  " is " + theMath(length, userInputType));
	}
	
	public static double theMath(double length, String userInputType) {
		
		
		if(userInputType.equals("f")) {
			double resultMeter = (double)(( length * 0.3048));
			return (double) resultMeter;
			
		} else {
			double resultFoot = ((double)(length * 3.2808399));
			return (double) resultFoot;
		}
	} 

}
