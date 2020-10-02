package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class NonStartTest {
	
	@Test
	public void return_string_minus_first_char() {
	  //Arrange
	  NonStart myNonStart = new NonStart();
	  
	  //Act
	  String partialString = myNonStart.getPartialString("Hello", "Ladies");
	  
	  //Assert
	  Assert.assertEquals("elloadies", partialString);
	}
	
	@Test
	public void return_second_String_if_first_string_is_empty() {
	  //Arrange
	  NonStart myNonStart = new NonStart();
	  
	  //Act
	  String partialString = myNonStart.getPartialString("", "Chimney");
	  
	  //Assert
	  Assert.assertEquals("himney", partialString); 
	}
	 
	@Test
	public void return_first_string_if_second_string_is_empty() {
	  //Arrange
	  NonStart myNonStart = new NonStart();
	  
	  //Act
	  String partialString = myNonStart.getPartialString("Beach", "");
	  
	  //Assert
	  Assert.assertEquals("each", partialString);
	}
}