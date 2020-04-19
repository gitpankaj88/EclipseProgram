package com.webdriver.javaprogram;

public class Pattern10 {

	public static void main(String[] args) {
		
		char ch='*';
		for (char x = 1; x <= 5; x++)
		{
			for (int y = 1; y <= x; y++) 
			{
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		
	}

}
