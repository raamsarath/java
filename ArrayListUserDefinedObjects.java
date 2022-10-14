package com.collc.array;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int sid;
	String sname;
	float fees;
	public Student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}
}

public class ArrayListUserDefinedObjects {

	public static void main(String[] args) {
		Student s1=new Student(1, "sarath", 456.8f);
		Student s2=new Student(2, "jegan", 643.5f);
		Student s3=new Student(3,"dhoni",854.f);
		Student s4=new Student(4, "jedeja", 335.5f);
         
		ArrayList<Student> sob=new ArrayList<Student>();
		sob.add(s1);
		sob.add(s2);
		sob.add(s3);
		sob.add(s4);
		
		System.out.println(sob);
		
		Iterator<Student> siter=sob.iterator();
		System.out.println("ID\tNAME\tFEES");
		while(siter.hasNext()) {
			Student st1=siter.next();
			System.out.println(st1.sid+"\t"+st1.sname+"\t"+st1.fees);
	     	}
			
		}
	}


