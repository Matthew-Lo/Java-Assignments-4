package com.perscholas.inheritance;

public class Manager extends Employee {
	public Manager() {
		
	}
	public Manager(long id, String Name, String address, long phone, double salary) {
		super(id,Name,address,phone);
		super.basicSalary=salary;
	}
	
	@Override
	public double calculateTransportAllowance() {
		return 15.0*super.basicSalary/100;
	}
}
