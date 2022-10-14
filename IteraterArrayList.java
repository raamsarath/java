package com.collc.array;

import java.util.ArrayList;
import java.util.Scanner;

public class IteraterArrayList {


	public static void main(String[] args) {
		int num,n;
		ArrayList<Integer> iob=new ArrayList<Integer>();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Array Want you need a Elements");
	    n=sc.nextInt();
	    System.out.println("Enter "+n+" of elements" );
	    for(int i=0;i<n;i++) {
	    	num=sc.nextInt();
	    	iob.add(num);
	    }
	    System.out.println(iob);
	    System.out.println("Using enhanced for loop (each elements)");
	    for(int i:iob) {
	    	System.out.println(i);
	    }

	}

}
