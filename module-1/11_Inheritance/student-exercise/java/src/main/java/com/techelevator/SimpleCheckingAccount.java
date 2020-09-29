package com.techelevator;

public class SimpleCheckingAccount extends BankAccount {
	
	public SimpleCheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SimpleCheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	
	}
	

	@Override
	public int withdraw(int amountToWithdraw) {
		if (getBalance() - (amountToWithdraw) < -100) {
			super.withdraw(amountToWithdraw);
			
		if (getBalance() < 0 || getBalance() > -100) {
			super.withdraw(10);
			}
		}
		return getBalance();
	}
	
}
