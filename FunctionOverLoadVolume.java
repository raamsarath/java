package com.oops;
/*Design a class to overload a function volume() as follows:

(i)double volume(double r) – with radius ‘r’ as an argument, 
returns the volume of sphere using the formula: v = 4 / 3 × 22 / 7 × r3

(ii)double volume(double h, double r) – with height ‘h’ and radius ‘r’ as the arguments,
returns the volume of a cylinder using the formula: v = 22 / 7 × r2 × h
 
(iii) double volume(double l, double b, double h) –
with length ‘l’, breadth ‘b’ and height ‘h’ as the arguments, 
returns the volume of a cuboid using the formula: v = l × b × h 
 */

public class FunctionOverLoadVolume {
	double vol;;
      double volume( double r) {
		vol=(float)(4/3)*(22/7)*(r*r*r);
		return vol;
	}
	double volume(double h, double r){
		vol=(22/7)*r*r*h;
		return vol;
	}
	double volume(double l,double b,double h ) {
		vol=l*b*h;
		return vol;
	}

	public static void main(String[] args) {
		FunctionOverLoadVolume ob=new FunctionOverLoadVolume();
		double volsph= ob.volume(2);
		System.out.println("Volume of Sphere "+ volsph);
		double volcyl=ob.volume(3, 5);
		System.out.println("Volume of Cylinder "+volcyl);
		double volcuboid=ob.volume(4, 2, 6);
		System.out.println("Volume of Cuboid "+ volcuboid);

	}

}
