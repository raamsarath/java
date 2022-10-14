package com.collc.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	int eage;
	float esalery;
	public Employee() {
		super();	
	}
	void inputemployee() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a id");
		eid=sc.nextInt();
		System.out.println("Enter a Name");
		ename=sc.next();
		System.out.println("Enter a Age");
		eage=sc.nextInt();
		System.out.println("Enter your Salery");
		esalery=sc.nextFloat();
	}
	
	
	
}

public class EmployeMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		e1.inputemployee();
		e2.inputemployee();
		e3.inputemployee();
		e4.inputemployee();
		
		ArrayList<Employee>lemp=new ArrayList<Employee>();//LinkedList or Vector
		lemp.add(e1);
		lemp.add(e2);
		lemp.add(e3);
		lemp.add(e4);
		
		//Display Employee
		Iterator<Employee> eit=lemp.iterator();
		
		System.out.println("Employee Details");
		System.out.println("___________________________________________________");
		System.out.println("ID\tName\tAge\tSalary");
		while(eit.hasNext()) {
			Employee empobj=eit.next();
			System.out.println(empobj.eid+"\t"+empobj.ename+"\t"+empobj.eage+"\t"+empobj.esalery);
		}
		
		

	}

	}


