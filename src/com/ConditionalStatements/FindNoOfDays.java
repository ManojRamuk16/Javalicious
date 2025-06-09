package com.conditionalstatement;

import java.util.Scanner;
public class FindNoOfDays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year and month to find the number of days.");
		System.out.println("Year:");
		int year = s.nextInt();
		System.out.println("Enter Months in number:");
		int month = s.nextInt();
		Days(year,month);
		s.close();
	}
	static void Days(int year,int month) {
		//31 days month - 1,3,5,7,8,10,12
		if(month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month ==12 ) {
			System.out.println("The NUmber of  days is 31 days " );
		}else if(month ==2) {
			//leap year % 400 = 0 or (year % 100 !=0 and year%4=0) 
			if((year % 100 !=0 && year % 4 ==0) || year % 400 == 0  ) {
				System.out.println("The Number of days is 29 days");
			}else {
				System.out.println("The Number of days is 28 days");
			}
		}else {
			System.out.println("The Number of days is 30 days");
		}
	}
}
