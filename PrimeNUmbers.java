package com.webdriver.javaprogram;

public class PrimeNUmbers {

	public static void main(String[] args)

	{

		int i = 0;
		int num = 0;

		String PrimeNumber = "";

		for (i = 0; i <= 100; i++)

		{
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				PrimeNumber = PrimeNumber + i + " ";
			}

		}
		System.out.println("Primer number between 1 to 100 are :");
		System.out.println(PrimeNumber);
	}

}
