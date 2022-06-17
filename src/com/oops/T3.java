package com.oops;

public abstract class T3 {
	
	public T3() {
		
		System.out.println("Abstract default constructor");
	}
	public T3(int x) {

		System.out.println("Abstract constructor");
	}
	public T3(double x) {
		System.out.println("Abstract double constructor");
	}
	
	
	public abstract void m1();
	
	public void m2()
	{
		System.out.println("method m2");
	}
	static public void main(String args[]) {
		
		
	
	}

}
