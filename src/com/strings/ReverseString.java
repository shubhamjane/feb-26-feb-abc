package com.strings;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Shubham";
		String reverseName = "";
		char a;
		for(int i=0; i<name.length();i++) {
			a=name.charAt(i);
			reverseName = a+reverseName;
		}
		System.out.println("Reverse Name =" + reverseName);
	}

}
