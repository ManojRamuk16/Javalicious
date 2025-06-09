package com.conditionalstatement;


public class SeparateOddEven {
	public static void main(String[] args) {
		String odd = " ";
		String even = " ";
		OddEven(1,odd,even);
	}
	public static void OddEven(int num,String odd,String even) {
		if(num<101) {
		if(num %2 == 0) {
			even += num + " ";
		}else {
			odd += num + " "; 
		}
		OddEven(num+1,odd,even);
		}else {
		System.out.println("odd numbers are:" + odd);
		System.out.println("Even numbers are:" + even);
		}
	}
}
