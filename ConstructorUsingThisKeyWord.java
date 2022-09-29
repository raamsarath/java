package com.oops;

class Addition{
	int i,j,s;
	Addition(){
		this(7);
		//call one arg constructor ,this should come first,before any other statements
		System.out.println("No Argument Constructor");
	}
	Addition(int i){
		System.out.println("One Argument Constructor ");
		
	}
	Addition(int i,int j){
		System.out.println("Two Argument Constructor ");
		
	}
	void add(int i, int j) { //to refer to instance variable of a class use this keyword
		this.i=i;
		this.j=j;
		System.out.println("inside addition "+this);  //this refers to present object
		 s=i+j;
	}
	void display() {
		System.out.println("sum of "+i+" and " +j+" is ="+s);
	}
}
 public class ConstructorUsingThisKeyWord {
	public static void main(String[] args) {
		Addition ob=new Addition();
		Addition ob1=new Addition();
		System.out.println("created object "+ob);
		ob.add(3, 8);//11
		ob.display();
		ob1.add(3, 9); //12
		ob1.display();		
	}
}
