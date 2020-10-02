package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class FrontTimesTest {
	
	@Test
	public void return_first_three_letters_twice() {
		// Arrange
		FrontTimes myFrontTimes = new FrontTimes(); 
		
		//Act 
		String result = myFrontTimes.generateString("Chocolate", 2);
		
		//Assert
		Assert.assertEquals("ChoCho", result);
	}   
	
	@Test
	public void return_first_three_letters_three_times() {
		// Arrange
		FrontTimes myFrontTimes = new FrontTimes();
		
		//Act 
		String result = myFrontTimes.generateString("Hello", 3);
		
		//Assert
		Assert.assertEquals("HelHelHel", result);
	}
	
	@Test
	public void get_a_table_looking_like_a_1sdf() {
		
		FrontTimes myFrontTimes = new FrontTimes();
		
		//Act 
		String result = myFrontTimes.generateString("Ab", 3);
		
		//Assert
		Assert.assertEquals("AbAbAb", result);
	}
	

}
