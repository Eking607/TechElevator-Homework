package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class CigarPartytest { 
	 
	@Test
	public void have_party_with_forty_cigars_on_weekday_returns_true() {
		// Arrange
		CigarParty myCigarParty = new CigarParty(); 
		
		//Act 
		boolean haveParty = myCigarParty.haveParty(40, false);
		
		//Assert
		Assert.assertTrue(haveParty);
	} 
	@Test
	public void have_party_with_sixty_cigars_on_weekday_returns_true() {
		// Arrange
		CigarParty myCigarParty = new CigarParty();
		
		//Act 
		boolean haveParty = myCigarParty.haveParty(60, false);
		
		//Assert
		Assert.assertTrue(haveParty);
	}
	
	@Test
	public void have_party_with_thirty_cigars_on_weekend_returns_false() {
		// Arrange
		CigarParty myCigarParty = new CigarParty();
		
		//Act 
		boolean haveParty = myCigarParty.haveParty(30, true);
		
		//Assert
		Assert.assertFalse(haveParty);
	}

}
