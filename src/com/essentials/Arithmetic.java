package com.essentials;
import java.util.Scanner;
public class Arithmetic {
	public  void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the value for a and b for doing arithmetic calculations:");
		int a = inp.nextInt();
		int b = inp.nextInt();
		Arith(a,b);
	}
	public void Arith(int a, int b) {
		System.out.println("The Addition of a and b is:" + (a+b));
		
		System.out.println("The Subtraction of a and b is:"+(a-b));
		System.out.println("The Multiplication of a and b is :"+(a*b));
		System.out.println("The Division of a and b is :"+(a/b));
		System.out.println("The Modulos of a and b is :"+(a%b));
		System.out.println("The post increment of a is "+(++a));
	}
}
