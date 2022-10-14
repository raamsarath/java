package com.excpt;
class EmployeeException extends Exception{
	public EmployeeException(String s){
		super(s);
	}
}
 class Employee{
	void Input(int eid) {
		try {
			if(eid<=0||eid>=999) {
				throw new EmployeeException("Invaid Exception");
			}else {
				System.out.println("Valid Exception");
			}
		}
		catch(EmployeeException e) {
			e.printStackTrace();
		}
	}
	
	
}

public class EmployId {

	public static void main(String[] args) {
		Employee eob=new Employee();
		eob.Input(6985);

	}

}
