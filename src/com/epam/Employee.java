package com.epam;

public class Employee {
	
	private int id;
	private String deptName;
	private int salary;

	public Employee(int id, String deptName, int salary) {
		this.id = id;
		this.deptName = deptName;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
