package com.looping;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				sum=sum+i;
				
			}
		}
		System.out.println("Sum of the Factors is = "+sum);

	}

}
