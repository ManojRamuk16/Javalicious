package com.pattern;

import java.util.Scanner;

//*****
//****
// ***
//  **
//   *
public class PatternG {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row = 1;row<=n;row++) {
			for(int space =1;space <=row-1;space++) {
					System.out.print(" ");
			}
			for(int col =1;col<=n-(row-1);col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
