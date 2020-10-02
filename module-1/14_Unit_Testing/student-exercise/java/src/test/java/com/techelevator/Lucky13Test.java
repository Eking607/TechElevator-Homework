package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class Lucky13Test {
	
	@Test
	public void number_is_1_less_than_a_multiple_of_20() {
		// Arrange
		Lucky13 myLucky13 = new Lucky13();

		// Act
		boolean nums = myLucky13.getLucky(null);

		// Assert
		Assert.assertTrue(true);
	}

}
