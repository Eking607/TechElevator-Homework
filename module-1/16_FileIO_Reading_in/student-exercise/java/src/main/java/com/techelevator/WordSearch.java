package com.techelevator;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

//alices_adventures_in_wonderland.txt

public class WordSearch {public static void main(String[] args) throws FileNotFoundException {
	
	try (Scanner myScanner = new Scanner(System.in)) {
		
		
		System.out.print("What is the file that should be searched? ");
		String path = myScanner.nextLine();
		File input = new File(path);
		
		System.out.print("What is the search word you are looking for? ");
		String wordToLookUp = myScanner.nextLine();
		
		System.out.print("Should the search be case sensitive? (Y/N)? ");
		boolean upperOrLowerCase = myScanner.nextLine().toLowerCase().equals("Y");
		
		int lineNumber = 1; {
		try (Scanner myScanner2 = new Scanner(input.getAbsoluteFile())) {
			while (myScanner2.hasNextLine()) {
				String location = myScanner2.nextLine();
				if (upperOrLowerCase == false) {
					if (location.toLowerCase().contains(wordToLookUp.toLowerCase())) { 
					System.out.println(lineNumber + ") " + location);
				}
				else {
					if (location.contains(wordToLookUp)) {
						System.out.println(lineNumber + ") " + location);
					}
				}
				lineNumber = lineNumber + 1;
						}
					}
				}
			}
		}
}
}
	

