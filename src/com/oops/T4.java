package com.oops;

public class T4 {

	public static void m1() throws Exception{
		
		System.out.println("City Name is incorrect");
		
		throw new Exception();
	}
	public static void main(String[] args) throws Exception {
		
		String s= "fsagyvc";
		if(s.equals("Pune")) {
			System.out.println("City Name Entered Correctly");
		}else {
			m1();
		}
		
	}

}