package com.Basics;

public class StaticAndInstanceMethod {

	static int a = 10;
	int b = 20;
	
	public static void m1() {
		int c=30;
		System.out.println(a);
		System.out.println(c);
	}
	
	public void m2() {
		int d=40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}
	public static void main(String[] args) {

		m1();
		StaticAndInstanceMethod ref = new StaticAndInstanceMethod();
		ref.m2();
	}

}
