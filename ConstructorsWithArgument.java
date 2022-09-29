package com.cons;
//Function Overloading: Polymorphisam: Poly-Many, Pmoprphisam: forms
		//Function Overloading is an compiletime poymorphiasm:
		//If a class has multiple methods having same name but different in parameters,
		//it is known as Method Overloading.
		//Function overloading can be done one class

		//3 ways we can overload methods
		//1. No of arguments(By changing the number of arguments)
		//2.Based on datatype
		//3.By interchanging the datatype


		//Function overloading based on number of arguments

class FunctionOverload{
	void display() {
		System.out.println("Display method with zero argument");
	}
	void display(int i) {
		System.out.println("Display method with one int argument "+i);
	}
	void display(int i, int j) {
		System.out.println("Display method with two int argument "+i+"  and "+j);
	}
	void display(int i, int j, int k) {
		System.out.println("Display method with three int argument "+i+","+j+" and "+k);
		
	}
}

public class ConstructorsWithArgument {

	public static void main(String[] args) {

				FunctionOverload ob=new FunctionOverload();
				ob.display();
				ob.display(6);
				ob.display(5,8);
				ob.display(3, 6, 7);
			}

          }		
	



	 


