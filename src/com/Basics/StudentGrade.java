package com.Basics;

public class StudentGrade {

	public static void main(String[] args) {

		int studentgrade =60;

		if (studentgrade > 0 && studentgrade < 35) {
			System.out.println("You Are Fail In The Exam, Better luck Next Time");
		} else if (studentgrade >= 35 && studentgrade < 51) {
			System.out.println("You have pass the exam. Grade = 'D'");
		} else if (studentgrade > 50 && studentgrade < 61) {
			System.out.println("You have pass the exam. Grade = 'C'");
		} else if (studentgrade > 60 && studentgrade < 76) {
			System.out.println("You have pass the exam. Grade = 'B'");
		} else if (studentgrade > 75 && studentgrade < 86) {
			System.out.println("You have pass the exam. Grade = 'A'");
		} else if (studentgrade > 85 && studentgrade < 101) {
			System.out.println("You have pass the exam. Grade = 'A+'");
		} else {
			System.out.println("Please Enter Valid Data");
		}
	}

}
