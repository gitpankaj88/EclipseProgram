package com.webdriver.javaprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=1;
		for(int x=1;x<=20;x++)
		{
			System.out.print(c+" ");
			
		    c=a+b;
			a=b;
			b=c;
			
		}	

	}

}
