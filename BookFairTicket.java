package show.room.pur;

import java.util.Scanner;

class BookingTicket{
	 String bname;
	 double price,amt,dis;
	
	 BookingTicket() { 
		bname= "";
		price=0;
	 }
	
void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a book name");
		bname=sc.next();
	    System.out.println("Enter Your Price the book");
	    price=sc.nextDouble();
	}
void Calculate() {
	if(price<=1000) {
		dis=price*2/100;
		amt=price-dis;
		System.out.println("1.Discont Price"+amt);
	}
	else if(price<=2000){
		dis=price*3/100;
		amt=price-dis;
		System.out.println("2.Discont Price "+amt);
	}
	else {
		dis=price*15/100;
		amt=price-dis;
		System.out.println("3.Discont Price "+amt);
	}
	
}
void Display() {
	System.out.println("Book Name "+bname);
	System.out.println("Pay After Discont Price "+amt);
}
}

public class BookFairTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingTicket bft=new BookingTicket();
		bft.Input();
		bft.Calculate();
		bft.Display();
				

	}

}
