package com.Basics;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.println("Enter Third Number : ");
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("First Number is Largest");
			} else {
				System.out.println("Third Number is Largest");
			}
		} else {
			if (b > c) {
				System.out.println("Second Number is Largest");
			} else {
				System.out.println("Third Number is Largest");
			}
		}
	}
}
