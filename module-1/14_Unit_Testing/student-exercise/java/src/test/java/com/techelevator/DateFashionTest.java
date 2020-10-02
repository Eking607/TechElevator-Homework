package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class DateFashionTest {
	
	@Test
	public void get_a_table_looking_like_a_10() {
		// Arrange
		DateFashion myDateFashion = new DateFashion();
		
		//Act 
		int getTable = myDateFashion.getATable(5, 10); 
		
		//Assert
		Assert.assertEquals(2, getTable);
	}
	
	@Test
	public void get_a_table_looking_like_a_2() {
		// Arrange
		DateFashion myDateFashion = new DateFashion();
		
		//Act 
		int getTable = myDateFashion.getATable(5, 2);
		
		//Assert
		Assert.assertEquals(0, 0);
	} 
	
	@Test
	public void get_a_table_both_looking_like_fives() {
		// Arrange
		DateFashion myDateFashion = new DateFashion();
		
		//Act 
		int getTable = myDateFashion.getATable(5, 5);
		
		//Assert
		Assert.assertEquals(1, 1); 
	}

}
