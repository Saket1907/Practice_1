package com.stream.practice;

public class Employee {

	private String employeeName;
	private String employeeDept;
	private int employeeAge;
	private int employeeSalary;

	public Employee(String employeeName, String employeeDept, int employeeAge, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDept=" + employeeDept + ", employeeAge="
				+ employeeAge + ", employeeSalary=" + employeeSalary + "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
