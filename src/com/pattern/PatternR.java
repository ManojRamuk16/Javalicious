package com.pattern;

import java.util.Scanner;

//**********
//****  ****
//***    ***
//**      **
//*        *
//*        *
//**      **
//***    ***
//****  ****
//**********
public class PatternR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	} 
	static void pattern(int n) {
		for(int row=1;row<=2*n;row++) {
			for(int left=1;left<=n;left++) {
			if(left<n-(row-1)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
//			for(int right=1;right<=n;right++) {
//				if(right>row-1)
//			}
			System.out.println();
		}
	}
}
