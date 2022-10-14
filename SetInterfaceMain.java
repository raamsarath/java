package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceMain {

	public static void main(String[] args) {
		Set<Integer> sob=new HashSet<Integer>();
		sob.add(34);
		sob.add(57);
		sob.add(26);
		sob.add(70);
		sob.add(26);
		sob.add(null);
		System.out.println("Hash Set "+sob);
 
		Set<Integer>sob1=new LinkedHashSet<Integer>();
		sob1.add(34);
		sob1.add(57);
		sob1.add(26);
		sob1.add(70);
		sob.add(26);
		sob1.add(null);
		System.out.println("Linked HashSet "+sob1);
		
		Set<Integer>sob2=new TreeSet<Integer>();
		sob2.add(34);
		sob2.add(57);
		sob2.add(26);
		sob2.add(70);
		sob2.add(26);
		//sob2.add(null);
		System.out.println("Tree Set "+sob2);
	}

}
