package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	int eage;
	float esalary;

	public Employee() {
		super();
		
	}
	void inputEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details");
		System.out.println("Enter name");
		ename=sc.next();
		System.out.println("Enter Employee id");
		eid=sc.nextInt();
		System.out.println("Enter employee age");
		eage=sc.nextInt();
		System.out.println("Enter Employee salary");
		esalary=sc.nextFloat();
	}
}
class SortEmpSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.esalary==e2.esalary)
		     return 0;
		else if(e1.esalary<e2.esalary)
			return -1;
		else 
			return 1;
					
	}
	
}
class SortEmpAge implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.eage==e2.eage)
		     return 0;
		else if(e1.eage<e2.eage)
			return -1;
		else 
			return 1;
					
	}
	
}
public class ArrayListMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		e1.inputEmployee();
		e2.inputEmployee();
		e3.inputEmployee();
		e4.inputEmployee();
		
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
			System.out.println(empobj.eid+"\t"+empobj.ename+"\t"+empobj.eage+"\t"+empobj.esalary);
		}
		
		//Sort Employee data
		SortEmpSalary esort=new SortEmpSalary();
		Collections.sort(lemp,esort);
		System.out.println("After Sorting Employee Based on Salary");
		//Display Employee
				Iterator<Employee> eit1=lemp.iterator();
				
				System.out.println("Employee Details");
				System.out.println("___________________________________________________");
				System.out.println("ID\tName\tAge\tSalary");
				while(eit1.hasNext()) {
					Employee empobj1=eit1.next();
					System.out.println(empobj1.eid+"\t"+empobj1.ename+"\t"+empobj1.eage+"\t"+empobj1.esalary);
				}
				
				//Sort based on age, based on id, and based name
				SortEmpSalary esort1=new SortEmpSalary();
				Collections.sort(lemp,esort1);
				System.out.println("After Sorting Employee Based on Age");
				//Display Employee
						Iterator<Employee> eit2=lemp.iterator();
						
						System.out.println("Employee Details");
						System.out.println("___________________________________________________");
						System.out.println("ID\tName\tAge\tSalary");
						while(eit2.hasNext()) {
							Employee empobj2=eit1.next();
							System.out.println(empobj2.eid+"\t"+empobj2.ename+"\t"+empobj2.eage+"\t"+empobj2.esalary);
						}
	}

}
