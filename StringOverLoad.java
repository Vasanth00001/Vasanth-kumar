package com.stroverload;
class StrOverload{
	void check(String str,char ch) {
		int charcount  = 0;
		for (int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch1==ch) {
				charcount++;
			}
		}
		System.out.println("No  of  "+ch+" present "+charcount+" times");
	}
	void check(String str) {
		String s=str.toLowerCase();
		System.out.println("vowels present in the string");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.print(ch+",");
		}
	}
}
	public void reversestr(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
public class StringOverLoad {

	public static void main(String[] args) {
		StrOverload ob=new StrOverload();
		ob.check("success",'s');
		ob.check("EdubrigeIndia");
		ob.reversestr("computer");
		}
}
}
