package com.webdriver.javaprogram;

import java.util.Scanner;

public class PrimeNumberBetween1toN {

	public static void main(String[] args) {

		int i = 0;
		int num = 0;
		String PrimeNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N, where N is the number" + " upto which have to print the Prime NUmber");
		
		int N = scan.nextInt();
		scan.close();

		for (i = 1; i <= N; i++) {
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
		System.out.println("Primes Number Between 1 and "+N+" are :");
		System.out.println(PrimeNumber);

	}

}
