package com.essentials;
import java.util.Scanner;
public class Circle {
	public void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the radius of the circle:");
	double rad = s.nextDouble();
	Calcircle(rad);
	}
	public void Calcircle(double r) {
		float pi = 3.14f;
		System.out.println("The perimeter of the circle is:" + (2 * pi * r));
		System.out.println("The area of the circle is :"+(pi * r * r));
		System.out.println("The Diameter of the circle is :" + (2*d));
	}
}
