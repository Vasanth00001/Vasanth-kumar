package com.branchingstatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number between 1 and 5");
		num = sc.nextInt();
		switch(num) {
		case 1:System.out.println("one");
		        break;
		case 2:System.out.println("two");
        break;
		case 3:System.out.println("three");
        break;
		case 4:System.out.println("four");
        break;
		case 5:System.out.println("five");
        break;
        default:System.out.println("Invalid");
    
		}
	}

}
