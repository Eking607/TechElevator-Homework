package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the temperature: ");
	
		String userInput = keyboard.nextLine();
		double temp = Double.parseDouble(userInput);
		
		System.out.print("Is the temperature in (C)elsius or (F)ahrenheit? ");
		
		String userInputType = keyboard.nextLine();
	

		System.out.println(temp + userInputType +  " is " + theMath(temp, userInputType));
	}
	
	public static double theMath(double temp, String userInputType) {
		
		
		if(userInputType.equals("F")) {
			double resultTempC = (double)(( temp - 32) / 1.8);
			return (double) resultTempC;
			
		} else {
			double resultTempF = ((double)(temp * 1.8 + 32));
			return (double) resultTempF;
		}
	} 
}


	
	




