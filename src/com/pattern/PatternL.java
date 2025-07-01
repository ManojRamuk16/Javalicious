package com.pattern;

import java.util.Scanner;

//* * * * *
// * * * *
//  * * *
//   * *
//    *
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//spacecount - 0123443210
//starcount -9753113579 678910 13579 54321
public class PatternL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row=1;row<=n*2;row++) {
			int spaceCount = row>n? n*2-row:row-1;
			for(int space=1;space<=spaceCount;space++) {
				System.out.print(" ");
			}
			int starCount = row>n? 2 * row-5 : (n*2) - (row*2) + 1;
			for(int col = 1;col<=starCount;col++) {
				if(col % 2 ==1) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
