package com.arr.obj;

import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	static String  coname= "Yamaha Pvt Limited India";
void InputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a eid");
	eid=sc.nextInt();
	System.out.println("Enter Your Name");
	ename=sc.next();
}
void DiplayData() {
	System.out.println("Employe Id "+eid);
	System.out.println("Employe Name "+ename);
	System.out.println("Company Name "+coname);
	
}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		Employee[] ob=new Employee[7];
		for(int i=0;i<ob.length;i++) {
            ob[i]=new Employee();
            ob[i].InputData();
	}
		System.out.println("Company Records Are");
		for(int i=0;i<ob.length;i++) {
			ob[i].DiplayData();
		}
	}
}
