package com.str.cls;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hellow World Sarath";
		int cnt=0;
		int wc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'||  ch=='o'|| ch=='u' &&  ch=='A'|| ch=='E'|| ch=='I'||  ch=='O'|| ch=='U') {
				cnt =cnt+1;
				
			}
			
		}
		System.out.println("Vowels are "+cnt);
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if( ch==' ') {
        		wc++;
        		
        	}
        	
        }
        System.out.println("Total Words"+(wc++));
	}

}
