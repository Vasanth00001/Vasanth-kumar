package com.operators;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		int fnum,snum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		if(fnum>snum) {
			System.out.println(fnum +" is larger than "+snum);
		}
		else {
			System.out.println(snum+" is larger than "+fnum);
		}
		

	}

}
