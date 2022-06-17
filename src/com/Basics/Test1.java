package com.Basics;

public class Test1 {
	
	String name;
	char div;
	int rollno;
	
	public Test1(String n,char d,int r) {
		this.name=n;
		this.div=d;
		this.rollno=r;
	}

	public static void main(String[] args) {

		Test1 student1=new Test1("Ram",'A',1);
		Test1 student2=new Test1("Shyam",'A',2);
		Test1 student3=new Test1("Ramesh",'A',3);
		Test1 student4=new Test1("Suresh",'A',4);
		
		System.out.println(student1.name);
		System.out.println(student2.name);
		System.out.println(student3.name);
		System.out.println(student4.name);
	}

}
