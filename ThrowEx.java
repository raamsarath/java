package com.excpt;

import java.util.Scanner;

public class ThrowEx {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num a");
		a=sc.nextInt();
		System.out.println("Enter a num b");
		b=sc.nextInt();
		
		try {
			if(b==0) {
				throw new ArithmeticException("Divided By Zero Error");
			}
			else {
				c=a/b;
				System.out.println("Quotient of C "+c);
			}
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		} 
		
	}
}
