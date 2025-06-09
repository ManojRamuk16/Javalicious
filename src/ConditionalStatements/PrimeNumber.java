package com.conditionalstatement;

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check prime number or not:");
		int num = s.nextInt(),n=0;
		for(int i=2;i<=num/2;i++) {
			if(num % i != 0) {
				continue;
			}else {
				n=1;
				break;
			}
		}
		if(n == 0) {
			System.out.println("The Number is a prime number");
		}else {
			System.out.println("The Number is not a prime number");
		}
		
		System.out.println("Enter the number to check prime number or not:");
		int num2 = s.nextInt();
		boolean res = PrimeCheck(num2,2);
		if(res) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}
		s.close();
	}
	public static boolean PrimeCheck(int num,int i) {
		if(num <=2) 
			return(num == 2);
		if(num % i == 0)
			return false;
		if(i* i>num)
			return true;
		return PrimeCheck(num,i+1);
	}
}
