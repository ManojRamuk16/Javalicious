package com.essentials;
import java.util.Scanner;

public class StudentsAvg {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Tamil mark of the student:");
		int tamil = s.nextInt();
		System.out.println("Enter Maths mark of the student:");
		int maths = s.nextInt();
		System.out.println("Enter English mark of the student:");
		int eng = s.nextInt();
		System.out.println("Enter Science mark of the student:");
		int sci = s.nextInt();
		System.out.println("Enter Social mark of the student:");
		int social = s.nextInt();
		double res = CalculateAvg(tamil,maths,eng,sci,social);
		System.out.println("The average of the student is:" + res);
	}
	public static double CalculateAvg(int a,int b,int c,int d,int e) {
		int sum = a + b + c + d + e;
		double avg = sum / 5;
		return avg;
	}
}
