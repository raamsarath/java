package show.room.pur;

import java.util.Scanner;

class TicketCounter{
	    String name,coach;
	    long mobno;
	     int amt,totalamt;
  void Accept() {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Name");
	    name=sc.nextLine();
	    System.out.println("Enter a Coach");
	    coach=sc.nextLine();
	    System.out.println("Enter Your Mobile Num");
	    mobno=sc.nextLong();
	    System.out.println("Enter a Amount");
	    amt=sc.nextInt();
}
  void Update(){
	  if(coach.equals("First AC")) {
		  totalamt=amt+700;
	  }
	  else if(coach.equals("Second AC")) {
		  totalamt=amt+500;
	  }
	  if(coach.equals("Third AC")) {
		  totalamt=amt+250;
	  }
	  else if(coach.equals("Sleeper")) {
		  System.out.println("None");
	  }
  }
  void Display() {
	  System.out.println("Ticket Details :");
	  System.out.println("Name :"+name);
	  System.out.println("Coach :"+coach);
	  System.out.println("Mobile Number :"+mobno);
	  System.out.println("Ticket Booking After Total Amount :"+totalamt);
	  
  }
}
public class RailwayTicket {

	public static void main(String[] args) {
		TicketCounter rtc=new TicketCounter();
		rtc.Accept();
		rtc.Update();
		rtc.Display();
	}

}
