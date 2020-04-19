package com.webdriver.javaprogram;

public class Pattern8 {

	public static void main(String[] args) {
		
		
		char ch='*';
		for (char x = 1; x <= 5; x++)
		{
			for (int y = 5; y >= x; y--) 
			{
				System.out.print(ch + " ");
			}
			    System.out.println();
		}
		
		

	}

}
