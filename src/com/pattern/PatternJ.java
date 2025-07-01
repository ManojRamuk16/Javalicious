package com.pattern;

import java.util.Scanner;

//	  *
//   * *
//  * * *
// * * * *
//* * * * *
public class PatternJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row =1;row<=n;row++) {
			for(int space =1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int col =1;col<= 2*row - 1;col++) {
				if((col & 1) == 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
