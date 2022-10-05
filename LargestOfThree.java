package com.operators;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		int fnum,snum,tnum,largest;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		tnum = sc.nextInt();
		 
		largest = (fnum>snum && fnum>tnum)?fnum:(snum>fnum && snum>tnum)?snum:tnum;
		System.out.println("the largest of 3 numbers ="+largest);
		
		
		

	}

}
