package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test { 
	
	MaxEnd3 myMaxEnd = new MaxEnd3(); 
	
	@Test
	public void return_largest_element_between_first_and_last_element_in_the_array() {
		int[] testArray = {1, 2, 3};
		int[] expectedArray = {3, 3, 3};
		int[] returnArray = myMaxEnd.makeArray(testArray);
		Assert.assertArrayEquals(expectedArray, returnArray);
		
}
	@Test
	public void return_largets_element_between_first_and_last_element_in_the_array2() {
		int[] testArray = {11, 5, 9};
		int[] expectedArray = {11, 11, 11};
		int[] returnArray = myMaxEnd.makeArray(testArray);
		Assert.assertArrayEquals(expectedArray, returnArray);  
	
	} 
}
		
	

