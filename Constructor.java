package com.functions;

public class Constructor {
	//instance variables
	    int i;
		String s;
		float sal;
		// constructor with no argument
		Constructor() {//constructor is same name as class and constructor
			//will not have return type
		
			i=9;//constructor is used to intialize the member data of a class
			s="HELLO";
			sal=456.7f;
			
		}
		public static void main(String[] args) {
			//int k; //local variable
			Constructor ob=new Constructor();//call object class class constructor
			//constructor is called on object creation ,implicit call
			System.out.println("i= "+ob.i);
			System.out.println("s= "+ob.s);
			System.out.println("sal= "+ob.sal);
			//System.out.println("k= "+k);
			
			
	}


}
