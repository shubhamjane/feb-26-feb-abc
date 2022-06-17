package com.Basics;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 121;
		int y=0;
	    int x=num;
	    while (num!=0) {
	      int remainder=num%10;
	      y=y*10+remainder;
	      num/=10;
	    }
	    if (x==y)
	      System.out.println( x+ " is Palindrome.");
	   
	    else
	      System.out.println( x+ " is not Palindrome.");
	
	}

}
