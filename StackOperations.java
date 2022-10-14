package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
	    Stack<Integer> sob=new Stack <Integer>();
		sob.push(45);
		sob.push(23);
		sob.push(27);
		sob.push(75);
		System.out.println(sob);
		System.out.println("Stack Operation "+sob.pop());
		
		Iterator<Integer> itstack=sob.iterator();
         while(itstack.hasNext()) {
        	 System.out.println(itstack.next());
         }
	}

}
