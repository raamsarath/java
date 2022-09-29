package com.str.cls;

public class NewRefernce {
	//Program to count no of vowels in string , no of words and revers sentence
	

		public static void main(String[] args) {
			String s="Hello World hi";
			String h="Sarath";
			int cnt=0;
			int wc=0;
			for(int i=0;i<s.length();i++) {
			    char ch=s.charAt(i);
			    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			    	cnt=cnt+1;
			    }
			}
			System.out.println("No of vowels "+cnt);
			//no of words  //3
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch==' ') {
					wc++;
				}
			}
			System.out.println("Num of words ="+(wc+1));
			//reverse the sentence
			//ih dlroW olleH
			
			System.out.println("Reverse sentence");
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
				
			}
			for(int i=h.length()-1;i>=0;i--) {
				System.out.print(h.charAt(i));
			
	     }
		
		}

		
	}


