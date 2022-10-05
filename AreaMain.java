package com.branchingstatements;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		int choice;
		float area,length,breadth,base,height,radius,pi=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("******MENU******");
		System.out.println("1.AREA OF SQUARE");
		System.out.println("2.AREA OF RECTANGLE");
		System.out.println("3.AREA OF TRIANGLE");
		System.out.println("4.AREA OF CIRCLE");
		System.out.println("ENTER YOUR CHOICE");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Enter length of square");
		length=sc.nextFloat();
		area=length*length;
		System.out.println("area of square = "+area);
		
		case 2:System.out.println("Enter length and breadth of rectangle");
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		area=length*breadth;
		System.out.println("area of rectangle = "+area);
		
		case 3:System.out.println("Enter base and height of triangle");
		base=sc.nextFloat();
		height=sc.nextFloat();
		area=(base*height)/2;
		System.out.println("area of triangle = "+area);
		 
		case 4:System.out.println("Enter radius of circle");
		radius=sc.nextFloat();
		area=pi*radius*radius;
		System.out.println("area of circle = "+area);	
		}

	}

}
