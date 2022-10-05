package com.array;

import java.util.Scanner;

public class ArraySum {

public static void main(String[] args) {
   int ar[]=new int[5];
   int sum=0;
   int max;
   Scanner sc=new Scanner(System.in);
   //input the array elements
   System.out.println("Enter the "+ar.length+" elements");
        for(int i=0;i<ar.length;i++) {
        ar[i]=sc.nextInt();
        }
       
        //display array elements 
        System.out.println("Array elements are");
        for(int i:ar) {
        System.out.println(i);
        }
       
        //sum of all array elements
        for(int i=0;i<ar.length;i++) {
        sum=sum+ar[i];
    }
        System.out.println("Total of all array elements = "+sum);
        
        //Another method to sum array elements
        /*for(int i:ar) {
        sum=sum+i;
        }*/
        //MAX of array elements
        max =ar[0];
        for(int i=1;i<ar.length;i++) {
        	if(ar[i]>max) {
        		max=ar[i];
        	}
        	System.out.println("Maximum Elements = "+max);
        	
        //MIN of array elements
        	/*min =ar[0];
        	for(int i=1;i<ar.length;i++) {
        		if(ar[i]<min) {
        			min=ar[i];
        			}
        		System.out.println("Minimun Elements = "+min);
        	}*/
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
    
        }
        }
}
        		




