package com.techelevator;

public class Employee {
	private long employeeId;
	String firstName;
	String lastName;
	String email;
	double salary = 60000;
	String department;
	String hireDate;
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getHireDate() {
		return hireDate;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDepartment(String department) {
		this.department = department;
		
	}
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public Employee (long employeeId, String firstName, String lastName, String email, String department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
		this.hireDate = hireDate;
	}
	
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	
	public void raiseSalary(double percent) {
		double raiseSalary = salary * Math.abs(percent/100.00);
		salary = raiseSalary + salary;
	}
}
