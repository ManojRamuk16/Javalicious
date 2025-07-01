package com.pattern;

import java.util.Scanner;

//		1
//	  1   1
//   1  2   1
// 1  3   3  1
//1   4   6   4   1
//val = val * (i - j) / (j + 1);
public class PatternP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			int val=1;
			for(int col=1;col<=row;col++) {
				System.out.print(val+ " ");
				val = val* (row-col)/(col);
			}
			//4th -> val = 1 
			System.out.println();
		}
	}
}





