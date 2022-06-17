package com.oops;

public class T0 {

	public T0() {
		this(10);
		System.out.println("I am no arogument constructor");
	}
	public T0(int x) {
		this(5.5);
		System.out.println("I am int arogument constructor");
	}
	public T0(double y) {
		this('A');
		System.out.println("I am double arogument constructor");
	}
	public T0(char z) {
		this("Shubham");
		System.out.println("I am char arogument constructor");
	}
	public T0(String s) {
		System.out.println("I am string arogument constructor");
	}
	public static void main(String[] args) {
		T0 ref = new T0();
	}
}
