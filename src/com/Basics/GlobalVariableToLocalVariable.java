package com.Basics;

public class GlobalVariableToLocalVariable 
{

	int x;
	
	public static void main(String[] args) 
	{

		GlobalVariableToLocalVariable ref = new GlobalVariableToLocalVariable();
		
		int y = 20;
		
		ref.x=y;
		
		System.out.println(ref.x);
		
	}

}
