package com.Basics;

public class Pattern {

	public static void main(String[] args) {

		int num = 5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k<num;k++) {
				System.out.print("* ");
			}
			for(int l=i;l<=num;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
