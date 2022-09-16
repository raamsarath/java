package edu.com.main;

import java.util.Scanner;

class Student{
       String sname;
       int sage;
       float sfees;
       String semail;
       
       void InputData(){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your student name :");
			sname=sc.nextLine();
			System.out.println("Enter your student age :");
			sage=sc.nextInt();
		    System.out.println("Enter your student fees :");
		    sfees=sc.nextFloat();  
		    System.out.println("Enter your student email:");
		    semail=sc.nextLine();   
		}
		void DisplayData() {
			 System.out.println("Name :"+sname );
			 System.out.println("age :"+sage);
			 System.out.println("Fees:"+sfees);
			 System.out.println("Email:"+semail);
		}
public class StudentsMainApp {

	public static void main(String[] args) {
		Student s1=new Student(); //Object creation
		s1.InputData();
		s1.DisplayData();
		

	}

}
}