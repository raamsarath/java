package com.oops;

public class SeriesOverLoad {
	void series(int x,int n) {
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum=(float)(sum+Math.pow(x, i));
	}
		System.out.println("Sum Of Given Num "+sum);
	}
	void series(int p) {
		int t=0;
		for(int i=1;i<=p;i++) {
			t=(i*i*i)-1;
			System.out.print(t+" ,");
		}
		System.out.println();
	}
	void series() {
		float sum=0;
		for(int i=1;i<=9;i++) {
			sum=sum+(float)1/i;
		}
		System.out.println("Sum of given num is "+sum);
	}
	             
	public static void main(String[] args) {
		SeriesOverLoad ob=new SeriesOverLoad();
		ob.series();
		ob.series(10);
		ob.series(2,10);
		
	}

}
