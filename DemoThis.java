package com.functions;
class Addition{
	int i,j,s;
	void add(int i,int j) {
		this.i=i;
		this.i=j;
		System.out.println("inside addition "+this);// this is refers to present object 
	   s=i+j;
	  }
	void display() {
		System.out.println("Sum = "+s);
	}
	
}

public class DemoThis {

	public static void main(String[] args) {
		Addition ob =new Addition();
		System.out.println("Created object "+ob);
		ob.add(3,8);
		ob.display();
		
		

	}

}
