package types.data;

import java.util.Scanner;

public class UserDataTypes {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    int i;
	    short s;
	    byte b;
	    float f;
	    double d;
	    char ch;
	    String fname;
	   
	    System.out.println("Enter your name ");
	    fname=sc.next();
	    System.out.println("Enter integer value");
	    i=sc.nextInt();
	    System.out.println("Enter short value");
	    s=sc.nextShort();
	    System.out.println("Enter byte value");
	    b=sc.nextByte();
	    System.out.println("Enter float value");
	    f=sc.nextFloat();
	    System.out.println("Enter double value");
	    d=sc.nextDouble();
	    System.out.println("Enter char value");
	    ch=sc.next().charAt(0);
	    System.out.println("Name:"+fname);
	    System.out.println("Integer Value:"+i);
	    System.out.println("Short Value:"+s);
	    System.out.println("Byte Value;"+b);
	    System.out.println("Float Value;"+f);
	    System.out.println("Double Value;"+d);
	    System.out.println("Char Value;"+ch);
	}

}
