package com.condition;

import java.util.Scanner;

public class VowelOrConsonantIfElse {

	public static void main(String[] args) {
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Char");
		ch=sc.next().charAt(0);
		if(ch=='A' ||ch=='a'|| ch=='E'|| ch=='e'||ch=='I'|| ch=='i'||
		     ch=='O'|| ch=='o'||ch=='U'|| ch=='u') {
			System.out.println(ch+" is an Vowel");
		
		} 
	else {
			System.out.println(ch+" is Consonant");
		}
	}

}
