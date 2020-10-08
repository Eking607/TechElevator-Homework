package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		
			File myFile = new File("300 FizzBuzz.txt");
			
			try {
				myFile.createNewFile();
				System.out.println("FizzBuzz.txt has been created.");
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
			
			try(PrintWriter myFileWriter = new PrintWriter(myFile.getAbsoluteFile())) {
				
				for (int i = 1; i <= 300; i++) {
					if ((i % 3  == 0)  && (i % 5 == 0)) {
						myFileWriter.println("FizzBuzz");
					}
					else if ((i % 3 == 0) || Integer.toString(i).contains("3")) {
						myFileWriter.println("Fizz");
					}
					else if ((i % 5== 0)|| Integer.toString(i).contains("5")) {
						myFileWriter.println("Buzz");
					}
					else {
						myFileWriter.println(Integer.toString(i));
					}
					}
					
			}
			
			
			
			
			
		}
	}



