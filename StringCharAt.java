// program to find number of vowels in a sentence
package com.str;

public class StringCharAt {

	public static void main(String[] args) {
		String s="Hello world vk";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				count=count+1;
				}
		}System.out.println("NO of vowels = "+count);
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if (ch==' ') {
			count=count+1;
		}
		}
	System.out.println("No of words = "+count);
	}

	}
	



