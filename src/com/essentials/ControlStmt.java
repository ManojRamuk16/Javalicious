package com.essentials;

import java.util.Scanner;

//control statement is used to determine to smooth flow of the program whether the statement is executed or not.
//control statement is divided into decision making statement, looping statement and jump statement.

//Decision making - if ,if else,if else ladder,switch
//looping  - while,do while,for ,advanced for(foreach)
//jump statement - break,continue,return
public class ControlStmt {
	public void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age:");
		int age  = s.nextInt();
		System.out.println("Enter your nationality:");
		String nation = s.next();
		nation.toLowerCase();
		CheckEligible(age,nation);
		}
	public void CheckEligible(int age,String nationality) {
		if(age > 18 && nationality == "indian") {
			System.out.println("Congratulations you're eligible for voting")
		}
		else {
			System.out.println("Not elgible")
		}
	}

}
