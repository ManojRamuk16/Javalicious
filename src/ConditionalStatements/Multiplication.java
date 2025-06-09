package com.conditionalstatement;

import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which table:");
		int mul = s.nextInt();
		Multiply(1,mul);
		s.close();
	}
	public static void Multiply(int time,int mul) {
		if(time<11) {
			System.out.println(time + " X " + mul + " = " +(time * mul) );
			Multiply(time+1,mul);
		}
	}
}
