package com.over.load;
class Overload2{
	void display(int i,int j){
	     int s=i+j;
	      System.out.println("The addition of two integers num "+s);
	  }
     void display(double i,double j){
	      double s=i+j;
	      System.out.println("The addition of two double num "+s);
	}
     void display(float i,float j){
	      float s=i+j;
	      System.out.println("The addition of two float num "+s);
	}
     void display(short i,short j){
	      short s =(short)(i+j); 
	      System.out.println("The addition of two short num "+s);
	  }
     void display(byte i,byte j){
	      byte s=(byte)(i+j);
	      System.out.println("The addition of two double num "+s);
	}
     void display(long i,long j){
	      long s=i+j;
	      System.out.println("The addition of two float num "+s);
	}
}

public class OverloadMain2 {

	public static void main(String[] args) {
		 Overload2 ob1=new  Overload2();
		 ob1.display(1, 5);
		 ob1.display(1.4,4.6);
		 ob1.display(2324, 323);
		 ob1.display(23, 24);
		 ob1.display(2, 5);
		
		

	}

}
