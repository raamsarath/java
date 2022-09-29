package com.sarath;

import java.util.Scanner;

public class EvenOddIfElse {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Num");
		num=sc.nextInt();
		if(num%2 ==0) {
			System.out.println("Even Num:"+num );
			
		}
		else {
			System.out.println("Odd Num :"+num);
		}
	}

}
