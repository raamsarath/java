package com.condition;

import java.util.Scanner;

class ElseIfLader{
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		
	}
	void checknum() {
		if(num==10) {
			System.out.println("the number is "+num);
		
		}else if(num==20) {
			System.out.println("The number is "+num);
			
		}else if(num==30) {
			System.out.println("The number is "+num);
			
		}else {
			System.out.println("The number is "+num);
		}
	}
}

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElseIfLader ob=new ElseIfLader();
		ob.inputData();
		ob.checknum();
		
		
		

	
	}

}
