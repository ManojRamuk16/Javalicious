package com.conditionalstatement;

import java.util.Scanner;
public class PosNeg {
	public static void main(String args[]) {
		System.out.println("Enter a number to check positive or negative:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num>0) {
			System.out.println("The number is positive");
		}else {
			System.out.println("The number is negative");
		}
		s.close();
	}

}
