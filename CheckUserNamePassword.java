package com.str;

import java.util.Scanner;

public class CheckUserNamePassword {

	public static void main(String[] args) {
		String uname,upass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		uname = sc.next();
		System.out.println("Enter password");
		upass = sc.next();
		
		if(uname.equalsIgnoreCase("vasanth") && upass.equals("vasanth@001")) {
			System.out.println("valid user");
		}else {
			System.out.println("Invalid user");

		}

	}

}
