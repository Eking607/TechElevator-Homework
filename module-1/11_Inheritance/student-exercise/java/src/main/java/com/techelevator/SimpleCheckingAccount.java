package com.techelevator;

public class SimpleCheckingAccount {
	
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		
	}
	
	public void BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	
	}
	
	

}
