package com.str.cls;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hellow";
		String s2="hellow";
		
		String s3=new String("hi");
		String s4=new String("hi");
		if(s1==s2) {
			System.out.println("both of equal");
		}
		else {
			System.out.println("not equal");
		}
		if(s3==s2) {
			System.out.println("both of equal");
		}
		else {
			System.out.println("not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("both of equal");
		}
		else {
			System.out.println("not equal");
		}
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("both of equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
