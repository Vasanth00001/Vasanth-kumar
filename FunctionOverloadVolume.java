package com.functions;

public class FunctionOverloadVolume {
	double vol;
	double volume(double r) {
		vol=(double)4/3*(double)22/7*Math.pow(r,3);
		return vol;	
	}
	double volume(double h,double r) {
		vol=(double)22/7*r*r*h;
	    return vol;
	}
	double volume(double l,double b,double h) {
		vol=l*b*h;
		return vol;
	}
 
	public static void main(String[] args) {
		FunctionOverloadVolume ob= new FunctionOverloadVolume();
		double volspr=ob.volume(3);
		System.out.println("Volume of the sphere = "+volspr);
		double volcyl=ob.volume(2,4);
		System.out.println("Volume of the cylinder = "+volcyl);
		double volcub=ob.volume(2,4,8);
		System.out.println("Volume of the cuboid = "+volcub);
		
		
		

	}

}
