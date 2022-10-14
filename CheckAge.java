package com.excpt;

import java.util.Scanner;

public class CheckAge {
	public static void Checkage(int age) {
		try {
			if(age<18) {
			   throw new ArithmeticException("Not Eligble for vote"); 
			}else {
				System.out.println("Eligible for vote");
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();	
		}	
	}

	public static void main(String[] args) {
	    int personage;
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Age ");
        personage=sc.nextInt();
        Checkage(personage);
	}
}
