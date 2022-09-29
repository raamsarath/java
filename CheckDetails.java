package com.str.cls;

import java.util.Scanner;

public class CheckDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String uname,pword;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Name");
            uname=sc.next();
            System.out.println("Enter a password");
            pword=sc.next();
            
            if(uname.equals("sarath") && pword.equalsIgnoreCase("sarath04")){
            	System.out.println("Valid Username");
     
            }else {
            	System.out.println("Not Valid Username");
            }
            
	}

}
