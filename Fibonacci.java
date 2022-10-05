package com.vasanth;
import java.util.Scanner;

class Fiboseries{
	
	int f1,f2,f3,terms;
	
	Fiboseries(){
		f1=0;
		f2=1;
	}
	
	void inputdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms");
		terms=sc.nextInt();
	}
	
	void fibo() {
		System.out.println("fibonacci series");
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<=terms-2;i++) {
			f3=f1+f2;
		System.out.println(f3);
		f1=f2;
		f2=f3;
		}
	}
}

public class Fibonacci {

	public static void main(String[] args) {
		
		Fiboseries ob = new Fiboseries();
		ob.inputdata();
		ob.fibo();
		
		

	}

}