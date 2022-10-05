package com.operators;

import java.util.Scanner;

public class PositiveOrNegative {
	int num;
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
	}
	void PosOrNeg() {
		if(num>0) {
			System.out.println(num+"is positive ");
		}
		else {
			System.out.println(num+" is negative");
		}
			         
	}

	public static void main(String[] args) {
		PositiveOrNegative ob = new PositiveOrNegative();
		ob.inputNum();
		ob.PosOrNeg();
		
		
		
		
	}

}



