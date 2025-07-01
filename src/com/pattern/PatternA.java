package com.pattern;
//*****
//*****
//*****
//*****
//*****
import java.util.Scanner;
public class PatternA {
	public static void main(String[] args) {
		int nRow ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
		s.close();
	}
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


