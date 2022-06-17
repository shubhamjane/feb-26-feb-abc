package com.Encapsulation;

public class Emp2 {
	
	Emp1 ref;
	Emp2(){
		ref=new Emp1();
	}
	public void getEmp1Details() {
		System.out.println(ref.getEmp1Salary());
	}
	public void setEmp1Detalis(double salary) {
		ref.setEmp1Salary(salary);
	}
	public void getEmp2Details() {
		System.out.println(ref.getEmp2Salary());
	}
	public void setEmp2Detalis(double salary) {
		ref.setEmp2Salary(salary);
	}
	static public void main(String[] args) {
		Emp2 ref2= new Emp2();
		ref2.getEmp1Details();
		ref2.getEmp2Details();
		ref2.setEmp1Detalis(80000);
		ref2.setEmp2Detalis(90000);
		ref2.getEmp1Details();
		ref2.getEmp2Details();
	}
}
