package com.bankapp;

import java.util.Scanner;

class Bank {
	  float amount;
	  void deposit(float depositamount) {
		  amount=amount+depositamount;
		  System.out.println("Balance in the bank after deposit = "+amount);
	  }
	  void withdraw(float withdrawamount) {
		  if(withdrawamount>amount) {
			  System.out.println("Insufficient Balance!!!!!");
			  System.out.println("Available Balance = "+amount);
		  }else {
			  amount=amount-withdrawamount;
			  System.out.println("After amount withdraw available balance"+amount);
	
		  }
	  }
	  }
public class BankAppMain {

	public static void main(String[] args) {
		float depamount,witamount;
		int choice;
		Bank bobj=new Bank();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("*******MENU FOR MY BANK *****");
		System.out.println("1.To Deposit");
		System.out.println("2.To Withraw");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		float depositamount;
		float withdrawamount;
		switch(choice) {
		case 1:System.out.println("Enter the amount to deposit");
		depositamount=sc.nextFloat();
		bobj.deposit(depositamount);
		break;
		
		case 2:System.out.println("Enter the amount to withdraw");
		withdrawamount=sc.nextFloat();
		bobj.withdraw(withdrawamount);
		break;
		default:System.out.println("Invalid input");
		}
		System.out.println("Do you want to continue (y/n)");
		char option=sc.next().charAt(0);
		if(option=='n') {
			break;
		}
		}
		System.out.println("EXIT");
		
		

	}

}
