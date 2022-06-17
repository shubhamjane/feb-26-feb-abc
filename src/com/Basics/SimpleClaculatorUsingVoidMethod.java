package com.Basics;

public class SimpleClaculatorUsingVoidMethod {

	public static void m1(int x, int y) {

		int sum = x + y;
		System.out.println(sum);
	}

	public static void m2(int x, int y) {

		int minus = x - y;
		System.out.println(minus);
	}

	public static void m3(int x, int y) {

		int multiply = x * y;
		System.out.println(multiply);
	}

	public static void m4(double x, double y) {

		double div = x / y;
		System.out.println(div);
	}

	public static void main(String[] args) {

		m1(10,20);
		m2(30,40);
		m3(50,60);
		m4(70,80);
	}

}
