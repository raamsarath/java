package com.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDequeStringMain {

	public static void main(String[] args) {
		
		Deque<String> dos=new ArrayDeque<String>();
        dos.add("sarath");
		System.out.println("The First Element "+dos);
		
		dos.add("rohit");
		System.out.println("After adding the element the first and second "+dos);
		
		dos.add("dhoni");
		System.out.println("The Final Front Of The Deque "+dos);
		
		int size=dos.size();
		
		System.out.println("The Size Of The Element "+size);
		
		dos.removeFirst();
		System.out.println("The Remove of first element "+dos);
	}

}
