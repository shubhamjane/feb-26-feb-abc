package com.Basics;

public class WhileLoop {

	public static void main(String[] args) {

		int x = 352507222;
		while (x!=0) {

			int rev= x%10;
			System.out.print(rev);
			x=x/10;
		}	
	}
}


