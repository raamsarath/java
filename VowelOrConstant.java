package com.condition;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Char");
		ch=sc.next().charAt(0);
		if(ch=='A'|| ch=='a') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='E'|| ch=='e') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='I'|| ch=='i') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='O'|| ch=='o') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='U'|| ch=='u') {
			System.out.println(ch+" is an Vowel");
		}else {
			System.out.println(ch+" is Consonant");
		}

	}

}
