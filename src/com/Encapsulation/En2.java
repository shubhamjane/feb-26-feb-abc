package com.Encapsulation;

public class En2 {

	En1 ref;
	public En2() {
		ref=new En1();
	}
	public void getMarks(int rollno) {
		System.out.println(ref.getStudentMarks());
	}
	public void setMarks(int marks) {
		ref.setStudentMarks(marks);
	}
	public static void main(String[] args) {

		En2 ref2 = new En2();		
		ref2.getMarks(1);
		ref2.setMarks(100);
		ref2.getMarks(1);
	}

}
