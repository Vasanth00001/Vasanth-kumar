//Array of objects
package com.objects;

import java.util.Scanner;

class EduEmployee{
	int eid;
	String ename;
	static String cname="Edubridge India";
	
	void inputEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid");
		eid=sc.nextInt();
		System.out.println("Enter employee Name");
		ename=sc.next();
	}
	void display() {
		System.out.println("Eid ="+eid);
		System.out.println("Ename="+ename);
		System.out.println("Company Name="+cname);
	}
	
}
public class ArrayObjects {

	public static void main(String[] args) {
		EduEmployee eob[]=new EduEmployee[2];  //array of objects     
		//int ar[]=new int[10];
		for(int i=0;i<eob.length;i++) {
			 eob[i]=new EduEmployee();
			 eob[i].inputEmp();
		}
		System.out.println("Employee Records are");
		for(int i=0;i<eob.length;i++) {
			eob[i].display();
		}
		
	}

}