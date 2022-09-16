package edu.com.main;

import java.util.Scanner;

class Employee1{
    String ename;
    int age;
    float salery;	


public void InputData1(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name :");
	ename=sc.nextLine();
	System.out.println("Enter your age :");
	age=sc.nextInt();
    System.out.println("Enter your name :");
    salery=sc.nextFloat();    
}
public void DisplayData1() {
	 System.out.println("Name :"+ename );
	 System.out.println("age :"+age);
	 System.out.println("Salery:"+salery);
}
public class EmployeeMainApp {

	public static void main(String[] args) {
		Employee1 employeeobject1=new Employee1(); //Object creation
		employeeobject1.InputData1();
		employeeobject1.DisplayData1();
	}
		
	}

}
