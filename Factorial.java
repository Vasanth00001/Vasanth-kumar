package com.vasanth;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,fact =1;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("The factorial number is "+fact);

	}

}
