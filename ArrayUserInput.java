package com.array;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+ ar.length +" elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		//Display enhanced for loop
		System.out.println("Using Enhanced for loop to display array elements");
		for(int i:ar) {
			System.out.println(i);
		}

	}

}
