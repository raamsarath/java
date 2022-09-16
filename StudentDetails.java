package edu.com.main;

import java.util.Scanner;

		class StudentDetails{
		    String sname;
		    int sage;
		    float sfees;
		    String semail;


		public void InputData(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your student name :");
			sname=sc.nextLine();
			System.out.println("Enter your student age :");
			sage=sc.nextInt();
		    System.out.println("Enter your student fees :");
		    sfees=sc.nextFloat();  
		    System.out.println("Enter your student email:");
		    semail=sc.nextLine();   
		}
		public void DisplayData() {
			 System.out.println("Name :"+sname );
			 System.out.println("age :"+sage);
			 System.out.println("Salery:"+sfees);
			 System.out.println("Salery:"+semail);
		}
		
			
		public class EmployeeMainApp {

			public static void main(String[] args) {
				StudentDetails employeeobject1=new StudentDetails (); //Object creation
				employeeobject1.InputData();
				employeeobject1. DisplayData();
			}
				
			}

		}


	


