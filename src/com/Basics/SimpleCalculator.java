package com.Basics;

public class SimpleCalculator {

	public static int addition(int x, int y) {

		System.out.println("I am Addition Method");
		int sum = x+y;
		return sum;
	}

	public static int subtraction(int x, int y) {

		System.out.println("I am Subtraction Method");
		int minus = x-y;
		return minus;
	}

	public static int Multiplication(int x, int y) {

		System.out.println("I am Multiplication Method");
		int multiply = x*y;
		return multiply;
	}

	public static double division(double x, double y) {

		System.out.println("I am Division Method");
		double div = x/y;
		return div;
	}
	public static void main(String[] args) {

		System.out.println(addition(10,20));
		System.out.println(subtraction(30,40));
		System.out.println(Multiplication(50,60));
		System.out.println(division(70,80));
	}

}
