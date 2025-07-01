package com.pattern;
import java.util.Scanner;

//* * * * *
// * * * *
//  * * *
//   * *
//    *
public class PatternK {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=row-1;space++) {
				System.out.print(" ");
			}
			int stars = n*2 - row*2 +1; 
			for(int col=1;col<=stars;col++) {
				if((col&1)==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
