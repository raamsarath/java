package com.sarath;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
	      int num;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number");
		    num=sc.nextInt();
		    if(num%2 == 0) {
				System.out.println(num+ " is even number");
			}
		     if(num%2 !=0 ) {
				System.out.println(num+ " is Odd number");
			}

	}

}
