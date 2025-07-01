package com.pattern;

import java.util.Scanner;

//    *
//   * *
//  *   *
// *     *
//*       *
// *     *
//  *   *
//   * *
//    *
// 6789 = 7531 2*(2*n -row) -1 => 4*n-2row -1
public class PatternO {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row =1;row<=n*2-1;row++) {
			int spaceCount = row>n?row-5:n-row;
			for(int space =1;space <=spaceCount;space++) {
				System.out.print(" ");
			}
			int colCount = row>n? (4*n)-(2*row)-1 :2*row-1;
			for(int col=1;col<=colCount;col++) {
				if(col == 1 || col == colCount) {
					System.out.print("*");
				}else {System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
