package com.oops;

public class T2 extends T3{
	
	public T2() {
		super(5);
		System.out.println("T2 Constuctor");
	}
	public T2(int x) {
		super(5.5);
		System.out.println("T2 Constuctor");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) {
		
		T2 ref = new T2(10);
		
		ref.m1();
	}


}
