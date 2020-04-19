package com.webdriver.javaprogram;

public class Pattern4 {

	public static void main(String[] args) {
		
		char ch='A';
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
