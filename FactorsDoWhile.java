package com.looping;

public class FactorsDoWhile {

	public static void main(String[] args) {
		int num=6;
		System.out.println("Factors of the numnbers is = ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}

	}

}
