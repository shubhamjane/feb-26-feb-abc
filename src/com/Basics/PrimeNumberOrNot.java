package com.Basics;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		int x = 25;
		int y =0;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				y++;
			}
		}
		if (y>0)
			System.out.println("Given number is not Prime number");
		else
			System.out.println("Given number is Prime number");
	}

}
