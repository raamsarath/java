package com.stack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<Integer>sob=new HashSet<Integer>(); //does not maintains the order
        //unique values
		sob.add(45);
		sob.add(98);
		sob.add(87);
		sob.add(21);
		sob.add(87);
		sob.add(null);


		System.out.println(sob);
		System.out.println("LinkedHashSet");
		Set<Integer>sob1=new LinkedHashSet<Integer>(); // maintains the order
		               //unique
		//unique values
		sob1.add(45);
		sob1.add(98);
		sob1.add(87);
		sob1.add(21);
		sob1.add(87);
		sob1.add(null);


		System.out.println(sob1);
		System.out.println("TreeSet Elements");
		System.out.println("TreeSet");
		Set<Integer>sob2=new TreeSet<Integer>();                                           
		//unique values
		sob2.add(45);
		sob2.add(98);
		sob2.add(87);
		sob2.add(21);
		sob2.add(87);
		//sob2.add(null); //null is not allowed


		System.out.println(sob2);


		}

		}

		/*
		* Set interface will not duplicate values
		* HashSet does not maintain the insertion order, null values
		* LinkedHashSet maintains the order , null is allowed
		* TreeSet: elements are sorted, null is not allowed
		* 
		* */


			
		
