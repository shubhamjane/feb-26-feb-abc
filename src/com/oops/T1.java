package com.oops;

class Inhert {
	public void m1() {
		double salary = 400000;
		System.out.println("Parent class Method");
		System.out.println(salary);
	}
}

public class T1 extends Inhert {

	public void m2() {
		int bouns = 10000;
		System.out.println("Own Method");
		System.out.println(bouns);
	}

	public static void main(String[] args) {

		T1 ref = new T1();
		ref.m1();
		ref.m2();
	}

}
