package show.room.pur;

import java.util.Scanner;

class ShowRoom1 {
	String name;
	long mobno;
	double cos,dis,amount;
void Input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Customer Name");
	name=sc.next();
	System.out.println("Enter Your Mobile Number");
	mobno=sc.nextLong();
	System.out.println("You Want Purchased The Cost");
	cos=sc.nextDouble();
}
void Caluculate() {
	if(cos<=10000) {
		     dis=(cos*5)/100;
		     amount=cos-dis;
             System.out.println("1.amount paid after discoun"+(cos-dis));	
         }
	else if(cos<=20000){
		 dis=cos*10/100;
		 amount=cos-dis;
		System.out.println("2.amount paid after discount" +amount);
	}
	else if(cos<=35000) {
		dis=(cos*15)/100;
		amount=cos-dis;
		System.out.println("3.amount paid after discoun" +amount);
	}
	else {
		dis=cos*20/100;
		amount=cos-dis;
		System.out.println("4.amount paid after discoun "+amount);
	}
	
}
void Display() {
	 System.out.println("Customer Name :"+name);
	 System.out.println("Mobile Number :"+mobno);
	 System.out.println("Amount to be Paid After Discount "+amount);
}

 }


public class ShowRoom {

	public static void main(String[] args) {
           ShowRoom1 ob1=new ShowRoom1();
           ob1.Input();
           ob1.Caluculate();
           ob1.Display();


	}

}
