package com.str;

public class StrConcat {

	public static void main(String[] args) {
		String s1="Good morning";
		String s2="vasanth";
		System.out.println(s1+""+s2);
		System.out.println("HELLO "+s2);
		System.out.println(6+8+"HELLO");
		System.out.println("HELLO"+(6+8));
		System.out.println((6+8)+"HELLO");
		String s4=s1.concat(s2);
		System.out.println(s4);

	}

}
