package com.bran.stats;

import java.util.Scanner;

public class SwitchVowelsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             char ch;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a Char");
             ch=sc.next().charAt(0);
             switch(ch) {
             case 'A':System.out.println("Vowels is " +ch);
                      break;
             case 'E':System.out.println("Vowels is " +ch);
                      break;        
             case 'I':System.out.println("Vowels is " +ch);
                      break;
             case 'O':System.out.println("Vowels is " +ch);
                      break;
             case 'U':System.out.println("Vowels is " +ch);
                      break;
              default :System.out.println("Consonant Is " +ch);        
             }
	}

}
