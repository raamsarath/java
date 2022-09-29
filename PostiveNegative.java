package com.sarath;

import java.util.Scanner;

class NegativePositive{
	 int num;
	 void InputData(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter aNum :");
		 num=sc.nextInt();
		 		 
	 }
	void CheckData() {
		if(num>0) {
			System.out.println("Postive Num "+num);
		}
		else {
			System.out.println("Negative Num "+num);
		}
	}
	 
 }

public class PostiveNegative {

	public static void main(String[] args) {
		NegativePositive np=new NegativePositive();
		np.InputData();
		np. CheckData();
	}

}
