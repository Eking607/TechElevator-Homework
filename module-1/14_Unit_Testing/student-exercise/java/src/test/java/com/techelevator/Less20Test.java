package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class Less20Test {
	@Test
	public void number_is_1_less_than_a_multiple_of_20() {
		// Arrange
		Less20 myLess20 = new Less20();
 
		// Act
		boolean oneLess = myLess20.isLessThanMultipleOf20(38);

		// Assert
		Assert.assertTrue(oneLess); 
	}

	@Test
	public void number_is_2_less_than_a_multiple_of_2() {
		// Arrange
		Less20 myLess20 = new Less20();

		// Act
		boolean twoLess = myLess20.isLessThanMultipleOf20(39);

		// Assert
		Assert.assertTrue(twoLess);
	}

	@Test
		public void number_is_perfect_multiple_Of_20() {
		// Arrange
		Less20 myLess20 = new Less20();
		
		//Act 
		boolean perfectMultiple = myLess20.isLessThanMultipleOf20(40);
		
		//Assert
		Assert.assertFalse(perfectMultiple);
	}
}
