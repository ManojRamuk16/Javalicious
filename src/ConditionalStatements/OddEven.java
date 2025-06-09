package com.conditionalstatement;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find odd or even:");
		int num = s.nextInt();
		if(num % 2 == 1) {
			System.out.println("The number is odd");
		}else {
			System.out.println("The number is even");
		}
		s.close();
	}
}
