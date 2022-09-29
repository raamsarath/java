package com.cons;

public class ConstructorsClass {
	int i;
	String s;
	Float sal;
	ConstructorsClass(){
		i=7;
		s="Sarath";
		sal=56087f;
	}
	

	public static void main(String[] args) {
		ConstructorsClass ob=new ConstructorsClass();
		System.out.println("num= "+ob.i);
		System.out.println("name ="+ob.s);
        System.out.println("salery= "+ob.sal);
	}

}
