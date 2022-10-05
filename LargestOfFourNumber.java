package com.operators;

import java.util.Scanner;

public class LargestOfFourNumber {

	public static void main(String[] args) {
	int fnum,snum,tnum,fonum,largest;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 4 numbers");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		tnum = sc.nextInt();
		fonum =sc.nextInt();
		 
		largest = (fnum>snum && fnum>tnum && fnum>fonum)?fnum:(snum>fnum && snum>tnum && snum>fonum)?snum:(tnum>fnum && tnum>snum && tnum>fonum)?tnum:fonum;
		System.out.println("the largest of "+fnum+","+snum+","+tnum+"and "+fonum+" is "+largest);
		

	}

}
