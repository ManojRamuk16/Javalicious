package com.pattern;

import java.util.Scanner;

//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class PatternE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nRow;
		System.out.println("Enter the number of rows:");
		nRow = s.nextInt();
		pattern(nRow);
	}
	static void pattern(int n) {
		for(int row =1;row<=(n*2)-1;row++) {
			int rowChange = row>n ? n*2-row : row;
			for(int col = 1; col<=rowChange;col++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
