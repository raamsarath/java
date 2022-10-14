package com.collc.array;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList< Integer> aob=new ArrayList<Integer>();
		aob.add(34);
		aob.add(5);
		aob.add(12);
		aob.add(3);
		aob.add(8);
		System.out.println(aob);
		//ArrayList elements to be sorted as ascendinding order
		Collections.sort(aob);
		System.out.println("After Sorting");
		System.out.println(aob);
		
		Collections.reverse(aob);
		System.out.println(aob);
		System.out.println("Shuffle");
		Collections.shuffle(aob);
		//one iterator
		System.out.println("After Shuffle");
		
		Collections.shuffle(aob);
		//one more iterator
		System.out.println(aob);
		Collections.swap(aob, 2, 3);
		System.out.println("After swap");
		System.out.println(aob);
		
	}

}


	


