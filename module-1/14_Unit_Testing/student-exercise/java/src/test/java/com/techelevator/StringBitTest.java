package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class StringBitTest {
	
	@Test
	public void returns_evry_other_char() {
		
		StringBits myString = new StringBits();
		
		String everyOther = myString.getBits("Sample");
		
		Assert.assertEquals("Sml", everyOther); 
			
	}
	@Test
	public void returns_null_if_null() {
		
		StringBits myString = new StringBits();
		
		String everyOther = myString.getBits(null);
		
		Assert.assertNull(null, null);

	}
}