package com.perscholas.inheritance;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance;
	private double Hra;
	
	public Employee() {
		this.specialAllowance=250.80;
		this.Hra=1000.50;
	}
	
	public Employee(long id, String Name, String address, long phone) {
		this.employeeId=id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.specialAllowance=250.80;
		this.Hra=1000.50;
	}
	
	public double calculateSalary()
	{
		double salary = basicSalary + ( basicSalary * specialAllowance/100)
		+ ( basicSalary * Hra/100);
		return salary;
	}
	
	public double calculateTransportAllowance()
	{
		return 10.0/100*basicSalary;
	}

	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	public void setHra(double hra) {
		Hra = hra;
	}

	
}
