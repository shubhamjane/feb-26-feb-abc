package com.strings;

public class S1 {

	public static void main(String[] args) {
		
		String name ="Pune";
		
		String name1 = "Pune";
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name==name1);
		
		System.out.println(name.charAt(2));
		
		String name2 = new String("Pune");
		
		String name3 = new String("Pune");
		
		System.out.println(name2.equals(name3));
		
		System.out.println(name2==name3);
		
	}

}
