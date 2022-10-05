package com.vasanth;

import java.util.Scanner;

public class FindNeonNumber {

	public static void main(String[] args) {
		int sum = 0,ne;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		ne = sc.nextInt();
		int squ=ne*ne;
		while(squ!=0) {
			int dig = squ %10;
			sum = sum +dig;
			squ = squ/10;
			
		}
		if(ne == sum) {
			System.out.println(ne+" is neon number");
		}
		else {
			System.out.println(ne+" is not a neon number");
			
			
				
			}
		}
		
		

	}


