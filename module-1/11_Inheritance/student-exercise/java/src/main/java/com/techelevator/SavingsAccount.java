package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	
	}
	
	@Override
	public int withdraw(int amountToWithDraw) {
		if (getBalance() - (amountToWithDraw) < 0) {
			super.withdraw(amountToWithDraw);
			
		if (getBalance() < 150) {
			super.withdraw(10);
			}
		}
		return getBalance();
	}
	
}

