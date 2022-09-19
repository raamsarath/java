package com.bran.stats;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
	     int chioce;
	     float area,length,breadth,base,height,radius,pi=3.14159f;
	     System.out.println("*****MENU********");
	     System.out.println("Area of Square");   //l*l
	     System.out.println("Area of Rectangle");//l*b
	     System.out.println("Area of Triangle");//1/2*b*h
	     System.out.println("Area of Circle"); //3.14159*r*r
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter your Choice");
	     chioce=sc.nextInt();
	     
	     switch (chioce) {
	     case 1 : System.out.println("Enter length of square");
	              length=sc.nextFloat();
	              area=length*length;
	              System.out.println( "Square  value is "+area );
	              break;
	     case 2 :  System.out.println("Enter length and breadth of rectangle");
	              length=sc.nextFloat();
	              breadth=sc.nextFloat();
	              area=length*breadth;
	              System.out.println( "Rectangle value    is "+area );
	              break;
	     case 3: System.out.println("Enter base and height of Triangle");
	             base=sc.nextFloat();
	             height=sc.nextFloat();
	             area=(float) (0.5*(base*height));
	             System.out.println( "Triangle  value is "+area );
	             break;
	     case 4 : System.out.println("Enter a pi and radius of Circle");
	              radius=sc.nextFloat();
	              area = pi*radius*radius;
	              System.out.println( "Circle  value is "+area );
	     
	     
	     
	     }
	     
	     
	     
	     
	     
	}
	
}
