package com.bran.stats;

import java.util.Scanner;

public class SwitchMonthOfTheYear {

	public static void main(String[] args) {
		String month;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Month");
		month=sc.next();
		switch(month) {
		case "january":  System.out.println("First month of the year");
		                 break;
		case "febrauary":System.out.println("Second month of the year");
                         break;
		case "march":    System.out.println("Third month of the year");
                         break;
		case "april":    System.out.println("Fourth month of the year");
                         break;
		case "may":      System.out.println("Fivth month of the year");
                         break;
		case "june":     System.out.println("Sixth month of the year");
                         break;
		case "july":     System.out.println("Seventh month of the year");
                         break;
		case "augest":   System.out.println("Eighth month of the year");
                         break;
		case "september":System.out.println("Nineth month of the year");
                         break;
		case "octomber": System.out.println("Tenth month of the year");
                         break;
		case "november": System.out.println("Eleventh month of the year");
                         break;
		case "december": System.out.println("Twelth month of the year");
                         break;
        default :	  System.out.println("Invalid input");             
		}

	}

}
