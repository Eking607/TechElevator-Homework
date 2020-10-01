package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{
	
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public List<Accountable> getAccounts() {
		return accounts;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    public boolean isVip() {
        int totalBalance = 0;
        for (Accountable account : accounts) {
            totalBalance = totalBalance + account.getBalance();
            
        }
        return totalBalance >= 25000; 
        
    }  
   
    	

    public void addAccount(BankAccount newAccount) {
        accounts.add(newAccount);
    }

}

