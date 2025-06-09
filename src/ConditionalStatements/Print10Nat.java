package com.conditionalstatement;

public class Print10Nat {
	public static void main(String[] args) {
		PrintNumbers(1);
	}
	public static void PrintNumbers(int i) {
		if(i<11) {
			System.out.println(i);
			PrintNumbers(i+1);
		}
	}
}
