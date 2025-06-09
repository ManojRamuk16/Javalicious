package com.conditionalstatement;

public class SumTentoFifty {
	public static void main(String[] args) {
		int sum =10;
		TenToFifty(sum,11);
		Split(50,10);
	}
	public static void TenToFifty(int sum,int num) {
		if(num != 51) {
			sum += num;
			TenToFifty(sum,num+1);
		}else {
			System.out.println("The sum is:" + sum);
		}
	}
	public static void Split(int first, int last) {
		int tot_no = last - first;
		if(tot_no <0) {
			tot_no *=-1;
		}
		tot_no +=1;
		int sum = tot_no/2 * (last+first);
		if(tot_no % 2 == 1) {
			sum += (last + first)/2;
		}
		System.out.println("The sum is :" + sum);
	}
	
}

//