package com.pattern;

import java.util.Scanner;

//   1 
//  212
// 32123
//4321234
// 32123
//  212
//   1

//condition
//1357531
public class PatternQ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	} 
	static void pattern(int n) {
		for(int row = 1;row<=n*2-1;row++) {
			int spaceCount = row>n? row-n:n-row;
			for(int space=1;space<=spaceCount;space++) {
				System.out.print(" ");
			}
			int rowChange = row>n?n*2-row:row;
			for(int col=rowChange;col>=1;col--) {
				System.out.print(col);
			}
			for(int col=2;col<=rowChange;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
