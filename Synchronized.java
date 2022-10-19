package com.thred;
class Printtable{
	synchronized void mulitplication(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);

		
	}
}
}

class  SynThreadClass1 extends Thread{
	 Printtable tob;
	public SynThreadClass1(Printtable t) {
		tob=t;
	}
	public void run() {
		tob.mulitplication(10);
	}
	 
}

class  SynThreadClass2 extends Thread{
     Printtable tob;
	public SynThreadClass2(Printtable t) {
		tob=t;
	}
	public void run() {
		tob.mulitplication(5);
	}
	
}
class  SynThreadClass3 extends Thread{
    Printtable tob;
	public SynThreadClass3(Printtable t) {
		tob=t;
	}
	public void run() {
		tob.mulitplication(2);
	}
	
}
public class Synchronized {

	public static void main(String[] args) {
		Printtable t=new Printtable();
		SynThreadClass1 t1=new  SynThreadClass1(t);
		SynThreadClass2 t2= new SynThreadClass2(t);
		SynThreadClass3 t3=new SynThreadClass3(t);
		t1.start();
		t2.start();
		t3.start();

	}

}
