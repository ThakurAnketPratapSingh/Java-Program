package com.anket.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String titel;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;
	
	

	public Employee(String name, String titel) {
		super(name);
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+", titel=" + titel + ", employerName=" + employerName + ", employeeGrade=" + employeeGrade
				+ ", salary=" + salary;
	}

}
