package com.looping;

public class Sum1to100EvenNumbers {

	public static void main(String[] args) {
		int i,s=0;
		i=2;
		while(i<=100) {
			s=s+i;
			i=i+2;
		System.out.println("total of 1 to 100 natural numbers = "+s);
		}

	}

}