package com.spring;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ","
				+ " empName=" + empName + ", "
						+ "empSalary=" + empSalary + "]";
	}
}
