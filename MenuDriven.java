package com.branchingstatements;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int choice;
		float num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("****MENU*****");
		System.out.println("1.Add");
		System.out.println("2.SUB");
		System.out.println("3.MUL");
		System.out.println("4.DIV");
		System.out.println("Enter your choice");
		 
		choice=sc.nextInt();
		
		System.out.println("Enter 2 numbers");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		
		switch(choice) {
		case 1:res=num1 + num2;
	           System.out.println("sum of "+num1+"and"+num2+"="+res);
		case 2:res=num1 - num2;
        System.out.println("sub of "+num1+"and"+num2+"="+res);
		case 3:res=num1 * num2;
        System.out.println("mul of "+num1+"and"+num2+"="+res);
		case 4:if(num2==0) {
			System.out.println("cannot divide by zero");
		}
		else {
			res=num1/num2;
        System.out.println("div of "+num1+"and"+num2+"="+res);
		}
		break;
		default:
			System.out.println("Invalid input");
		
		
		}

	}

}
