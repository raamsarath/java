package com.bran.stats;

import java.util.Scanner;

class Area{
	float area,length,breadth,base,height,radius,pi=3.14159f;
	Scanner sc =new Scanner(System.in);
void AreaOfSquare() {
	 System.out.println("Enter length of square");
     length=sc.nextFloat();
     area=length*length;
     System.out.println( "Square  value is "+area );
}
void AreaOfRectangle() {
	System.out.println("Enter length and breadth of rectangle");
    length=sc.nextFloat();
    breadth=sc.nextFloat();
    area=length*breadth;
    System.out.println( "Rectangle value    is "+area );
}
void AreaofTriangle() {
	 System.out.println("Enter base and height of Triangle");
     base=sc.nextFloat();
     height=sc.nextFloat();
     area=(float) (0.5*(base*height));
     System.out.println( "Triangle  value is "+area );
}
void AreaOfCircle() {
	System.out.println("Enter a pi and radius of Circle");
    radius=sc.nextFloat();
    area = pi*radius*radius;
    System.out.println( "Circle  value is "+area );

}
	
}

public class AreaMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 int chioce;
		 System.out.println("*****MENU********");
	     System.out.println("Area of Square");   //l*l
	     System.out.println("Area of Rectangle");//l*b
	     System.out.println("Area of Triangle");//1/2*b*h
	     System.out.println("Area of Circle"); //3.14159*r*r
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter your Choice");
	     chioce=sc.nextInt();
	     Area aob=new Area();
	     switch(chioce) {
	 
	     case 1 : aob.AreaOfSquare();
                  break;
	     case 2  :aob.AreaOfRectangle();
	              break;
	     case 3  :aob.AreaofTriangle();
	              break;
	     case 4 : aob.AreaOfCircle();
	              break;
	     default :System.out.println("Invalid Data");         
	}
	}
}
