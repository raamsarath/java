package com.grade.marks;

import java.util.Scanner;

class GradeMarks{
	int marks;
	
	void InputMarksGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Num :");
		marks=sc.nextInt();
	}
	void DisplayMarksGrade() {
		if(marks>=90&&marks<=100) {
			System.out.println("Grade Is A");
		}
		else if(marks>=70&&marks<=89) {
			System.out.println("Grade Is B");
		}
		else if(marks>=50&&marks<=69) {
			System.out.println("Grade Is C");
		}
		else if(marks>=30&&marks<=49) {
			System.out.println("Grade Is C");
		}
		else if(marks>=0&&marks<=29) {
			System.out.println("Grade Is C");
		}
		else {
			System.out.println("Invalid Data");
			
		}
}
}
public class StudentsGrade {

	public static void main(String[] args) {
		GradeMarks gm=new GradeMarks();
		gm.InputMarksGrade();
		gm.DisplayMarksGrade();

	}

}
