package com.array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		b=a;
		System.out.println("A element");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+"");
		
		System.out.println("b element");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]+"");
	}

}
