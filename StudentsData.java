package com.edu;
import java.util.Scanner;

class Student{
       String sname;
       int sage;
       float sfees;
       String semail;
       int eng,sci,math,socsi;
       int total;
       float average;
       void InputData(){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your student name :");
			sname=sc.nextLine();
			System.out.println("Enter your student age :");
			sage=sc.nextInt();
		    System.out.println("Enter your student fees :");
		    sfees=sc.nextFloat();  
		    System.out.println("Enter your student email:");
		    semail=sc.next();
       }
		void DisplayData(){    
		    System.out.println("Student Details :");
			 System.out.println("Name :"+sname );
			 System.out.println("age :"+sage);
			 System.out.println("Fees:"+sfees);
			 System.out.println("Email:"+semail);
		}
		void InputMaraks() {
			    Scanner sc=new Scanner(System.in);
		        System.out.println("Enter Student Maraks : English,Science,Maths,Socialscience");
				eng=sc.nextInt();
				sci=sc.nextInt();
				math=sc.nextInt();
				socsi=sc.nextInt();
		}
		void TotalAverageMaraks() {
				 total=eng+sci+math+socsi;
		    	   average=total/4;
		}
		void DisplayMaraks() {
		    	   System.out.println("Total Marks:"+total);
		    	   System.out.println("Average :"+average);
		}

		}
			



public class StudentsData {

	public static void main(String[] args) {
		Student s1=new Student(); //Object creation
		//classname obj-new classname();
		s1.InputData();
		s1.DisplayData();
		s1.InputMaraks();
        s1.TotalAverageMaraks();
        s1.DisplayMaraks();
	}

}
