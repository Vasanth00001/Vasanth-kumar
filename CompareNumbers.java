package com.operators;

import java.util.Scanner;

public class CompareNumbers {
int num;
void inputData() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
num=sc.nextInt();

}
void checknum() {
if(num==10) {
System.out.println("the number is 10");

}else if(num==20) {
System.out.println("The number is 20");

}else if(num==30) {
System.out.println("The number is 30");

}else if(num==40){
System.out.println("The number is 40");
}
else {
	System.out.println("INVALID NUMBER");
}
}

public static void main(String[] args) {
CompareNumbers ob=new CompareNumbers();
ob.inputData();
ob.checknum();
}



} 
