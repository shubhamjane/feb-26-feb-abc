package com.Basics;

public class FirstJavaProgram 
{

	int y;
	static int z;
	public static void main(String[] args) 
	{
		z=20;
		System.out.println(z);
		FirstJavaProgram ref = new FirstJavaProgram();
		ref.y=10;
		System.out.println(ref.y);
		
		FirstJavaProgram ref1 = new FirstJavaProgram();
		z=50;
		System.out.println(z);
		ref1.y=100;
		System.out.println(ref1.y);
		
		
		System.out.println(z);
	}

}
