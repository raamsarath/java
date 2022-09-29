
package com.str.cls;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sob=new StringBuilder ("Hello how are  you");  //sob=Hello how are you"
		System.out.println("Reverse string ");      //sob=uoy rea woh olleh bos
		sob.reverse();
		System.out.println(sob);
		sob.append("hi");
		System.out.println("After adding a word "+sob);
		sob.insert(3,"Edu");
		System.out.println("After insert "+sob);
		
	


	}

}
