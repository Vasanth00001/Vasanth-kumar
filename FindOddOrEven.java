package com.operators;

import java.util.Scanner;

public class FindOddOrEven {
	int num;
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
	}
	void findoddeven() {
		if(num%2==0) {
			System.out.println(num+"is even ");
		}
		else {
			System.out.println(num+" is odd");
		}
			         
	}

	public static void main(String[] args) {
		FindOddOrEven ob = new FindOddOrEven();
		ob.inputNum();
		ob.findoddeven();
		
		
		
		
	}

}
