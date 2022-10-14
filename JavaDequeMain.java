package com.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDequeMain {

	public static void main(String[] args) {
	     Deque<Integer> dob=new ArrayDeque<Integer>();
	     dob.add(1);
	     dob.add(2);
	     dob.add(3);
	     dob.add(5);
	     System.out.println("Inserting the Elements");
	     for(Integer integer:dob) {
	    	 System.out.println(integer);
	     }
	     dob.pop();
	     System.out.println("After Popping");//LIFO
	     for(Integer integer:dob) {
	    	 System.out.println(integer);
	     }
	     dob.remove(5);
	     System.out.println("Removing The Element 5 ; "+dob);
	     
	}

}
