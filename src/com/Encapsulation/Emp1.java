package com.Encapsulation;

public class Emp1 {

	private double salaryemp1;
	private double salaryemp2;
	
	public double getEmp1Salary() {
		return salaryemp1;
	}
	public void setEmp1Salary(double salary) {
		if(salary>0)
			salaryemp1=salary;
		else
			salaryemp1=0;
	}
	
	public double getEmp2Salary() {
		return salaryemp2;
	}
	public void setEmp2Salary(double salary) {
		if(salary>0)
			salaryemp2=salary;
		else
			salaryemp2=0;
	}
}
