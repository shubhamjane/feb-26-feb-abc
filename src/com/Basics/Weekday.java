package com.Basics;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of day");
		String dayName = sc.next();
		switch (dayName) {
		case "Monday" : System.out.println("Monday is working day"); break;
		case "Tuesday" : System.out.println("Tuesday is working day"); break;
		case "Wednesday" : System.out.println("Wednesday is working day"); break;
		case "Thursday" : System.out.println("Thursday is working day"); break;
		case "Friday" : System.out.println("Friday is working day"); break;
		case "Saturday" : System.out.println("Saturday is holyday day"); break;
		case "Sunday" : System.out.println("Sunday is holyday day"); break;
		default : System.out.println("Please enter valid day name");
		}
	}

}
