package com.Basics;

import java.util.Scanner;

public class PercentageExpectation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Have you got Vaccinated ans in : Yes or No");
		String dose = sc.nextLine();
		if (dose.equals("Yes")   ) {
			System.out.println("You can Enter to the mall");
			
			System.out.println("How many dose you completed ans in : 1 or 2");
			String dose1 = sc.nextLine();
			if (dose1.equals("1")) {
				System.out.println("You Can Only Enter into the mall. You cannot go to the theater");
			} else if (dose1.equals("2")) {
				System.out.println("You Can Enter into the mall. You can go to the theater and watch movie");
			}
		} else {
			System.out.println("Complete your vaccination then come to mall");
		}
	}
}
